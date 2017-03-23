package ru.mockertim.cbr;

import org.apache.axis.Constants;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.message.MessageElement;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import ru.cbr.web.GetCursOnDateXMLResponseGetCursOnDateXMLResult;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;

/**
 * Клиент для получения дынных о курсах валют с сайта ЦБР.
 *
 * Created at 13:33 08.10.14
 *
 * @author Timur Shakuov (t.shakuov@gmail.com)
 */
public class CBRFCurrencyClient {

    private String endpoint = "http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx";

    public static void main(String [] args) {
        try {
            String dateStr = "2016-01-31";
            if(args.length > 0) {
                dateStr = args[0];
            }
            CBRFCurrencyClient client = new CBRFCurrencyClient();
            client.setEndpoint("http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx");
            client.writeXmlCurrencyRateOnDateToFile(dateStr);
            String ratesOnDateXml = client.getCursOnDateXml(dateStr);
            client.getRatesDate(dateStr, ratesOnDateXml);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    /**
     * Возвращает дату курсов, содержащуюся в данных, полученных с сайта ЦБР.
     * @param requestDate
     * @param valuteDataXmlStr
     * @return
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    public String getRatesDate(String requestDate, String valuteDataXmlStr)
            throws ParserConfigurationException, SAXException, IOException {
        String responseDate = "";
        Document doc = getDocument(valuteDataXmlStr);
        NodeList nodes = doc.getElementsByTagName("ValuteData");
        int valuteDataNodesLength = nodes.getLength();
        if(valuteDataNodesLength > 0) {
            Element element = (Element) nodes.item(0);
            responseDate = element.getAttribute("OnDate");
            if(!responseDate.isEmpty()) {
                String year = responseDate.substring(0,4);
                String month = responseDate.substring(4,6);
                String day = responseDate.substring(6);
                responseDate = year + "-" + month + "-" + day;
            }
        }
        System.out.println("requestDate: " + requestDate);
        System.out.println("responseDate: " + responseDate);
        return responseDate;
    }

    /**
     * Если dateStr совпадает с датой, содержащейся в загруженных с сайта ЦБР данных,
     * то записывает эти данные в файл
     * @param dateStr - дата, на которую нужно загрузить курсы валют
     * @throws Exception
     */
    public void writeXmlCurrencyRateOnDateToFile(String dateStr) throws Exception {
        String cursXmlStr = getCursOnDateXml(dateStr);
        //System.out.println(cursXmlStr);
        String cursStr = getCursOnDate(dateStr);
        //System.out.println(cursStr);
        String cursDate = getRatesDate(dateStr, cursXmlStr);
        if(cursDate.equals(dateStr)) {
            writeCursToFile(cursXmlStr, dateStr);
        } else {
            System.out.println("Warning! RequestDate is different from ResponseDate."
                    + "\nRates were not written to file!");
        }
    }

    /**
     *
     * @param endpoint
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Получить курсы валют на текущую дату в виде xml-строки
     * @param dateStr date string in the YYYY-MM-DD format
     * @return
     */
    public String getCursOnDateXml(String dateStr) throws ServiceException, ParserConfigurationException,
            SAXException, IOException {
        Call call = initServiceCall();
        System.out.print("Getting currency rates from CBR ...");
        Object[] params = new Object[] {dateStr};
        System.out.print(" call invocation ...");
        GetCursOnDateXMLResponseGetCursOnDateXMLResult ret = (GetCursOnDateXMLResponseGetCursOnDateXMLResult)
                call.invoke(params);
        System.out.print(" done ...");
        MessageElement[] me = ret.get_any();
        call.clearOperation();
        System.out.println(" done.");
        return me[0].toString();
    }

    /**
     * Получить курсы валют на текущую дату в виде отформатированной строки
     * @param dateStr date string in the YYYY-MM-DD format
     * @return
     */
    public String getCursOnDate(String dateStr) throws ServiceException, ParserConfigurationException,
            SAXException, IOException {
        return parseXmlResult(getCursOnDateXml(dateStr), dateStr);
    }

    /**
     * Записывает xml-данные в файл
     * @param cursXmlStr
     * @param fileName
     * @throws IOException
     */
    public void writeCursToFile(String cursXmlStr, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(cursXmlStr);
        writer.flush();
        writer.close();
    }

    /**
     *
     * @return
     * @throws ServiceException
     * @throws MalformedURLException
     */
    private Call initServiceCall() throws ServiceException, MalformedURLException {
        System.out.print("Initializing service call ...");
        Service service = new Service();
        Call call = (Call) service.createCall();
        call.setTargetEndpointAddress(new java.net.URL(endpoint));
        call.setOperationName(new QName("http://web.cbr.ru/", "GetCursOnDateXML"));
        call.setSOAPActionURI("http://web.cbr.ru/GetCursOnDateXML");
        call.addParameter(new QName("http://web.cbr.ru/","On_date"),
                Constants.XSD_DATETIME, ParameterMode.IN);
        call.setReturnType(new QName("http://web.cbr.ru/", "GetCursOnDateXMLResult"),
                GetCursOnDateXMLResponseGetCursOnDateXMLResult.class);
        System.out.println(" done.");
        return call;
    }

    /**
     * Разбирает xml-разметку, и возвращает значимую для нас часть данных в текстовом формате
     * @param valuteDataXmlStr
     * @param dateStr
     * @return
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    private String parseXmlResult(String valuteDataXmlStr, String dateStr)
            throws ParserConfigurationException, SAXException, IOException {
        Document doc = getDocument(valuteDataXmlStr);
        NodeList nodes = doc.getElementsByTagName("ValuteCursOnDate");
        StringBuffer cursBuffer = new StringBuffer();
        cursBuffer.append("\n");
        cursBuffer.append("Курсы валют на " + dateStr + ":\n\n");
        int currenciesAmount = nodes.getLength();
        for (int i = 0; i < currenciesAmount; i++) {
            Element element = (Element) nodes.item(i);
            NodeList name = element.getElementsByTagName("Vname");
            Element line = (Element) name.item(0);
            cursBuffer.append("Vname: " + getCharacterDataFromElement(line) + "\n");
            NodeList nom = element.getElementsByTagName("Vnom");
            line = (Element) nom.item(0);
            cursBuffer.append("Vnom: " + getCharacterDataFromElement(line) + "\n");
            NodeList curs = element.getElementsByTagName("Vcurs");
            line = (Element) curs.item(0);
            cursBuffer.append("Vcurs: " + getCharacterDataFromElement(line) + "\n");
            NodeList code = element.getElementsByTagName("Vcode");
            line = (Element) code.item(0);
            cursBuffer.append("Vcode: " + getCharacterDataFromElement(line) + "\n");
            NodeList chCode = element.getElementsByTagName("VchCode");
            line = (Element) chCode.item(0);
            cursBuffer.append("VchCode: " + getCharacterDataFromElement(line) + "\n\n");
        }
        cursBuffer.append("Количество валют: " + currenciesAmount + "\n\n");
        return cursBuffer.toString();
    }

    /**
     * Возвращает данные, которые содержатся внутри xml-тега
     * @param e абстракция тега, например: <Vcode>RUB</Vcode>
     * @return содержимое тега, например: RUB
     */
    private String getCharacterDataFromElement(Element e) {
        Node child = e.getFirstChild();
        if (child instanceof CharacterData) {
            CharacterData cd = (CharacterData) child;
            return cd.getData().trim();
        }
        return "";
    }

    /**
     *
     * @param valuteDataXmlStr
     * @return
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    private Document getDocument(String valuteDataXmlStr)
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputSource is = new InputSource();
        is.setCharacterStream(new StringReader(valuteDataXmlStr));
        return db.parse(is);
    }
}
