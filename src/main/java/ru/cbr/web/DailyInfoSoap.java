/**
 * DailyInfoSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public interface DailyInfoSoap extends java.rmi.Remote {

    /**
     * Сальдо операций ЦБ РФ по предоставлению/абсорбированию ликвидности
     * (XMLDocument)
     */
    public ru.cbr.web.SaldoXMLResponseSaldoXMLResult saldoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставка ROISfix (XMLDocument)
     */
    public ru.cbr.web.ROISfixXMLResponseROISfixXMLResult ROISfixXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставка Ruonia (XMLDocument)
     */
    public ru.cbr.web.RuoniaXMLResponseRuoniaXMLResult ruoniaXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Депозиты банков в Банке России (млн. руб) (как xmlDocument)
     */
    public ru.cbr.web.OstatDepoXMLResponseOstatDepoXMLResult ostatDepoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Депозиты банков в Банке России (млн. руб)
     */
    public ru.cbr.web.OstatDepoResponseOstatDepoResult ostatDepo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставка ROISfix (DataSet)
     */
    public ru.cbr.web.ROISfixResponseROISfixResult ROISfix(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставка RUONIA (DataSet)
     */
    public ru.cbr.web.RuoniaResponseRuoniaResult ruonia(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Международные резервы Российской Федерации, еженедельные значения
     * (DataSet)
     */
    public ru.cbr.web.Mrrf7DResponseMrrf7DResult mrrf7D(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Международные резервы Российской Федерации, еженедельные значения
     * (XMLDocument)
     */
    public ru.cbr.web.Mrrf7DXMLResponseMrrf7DXMLResult mrrf7DXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Международные резервы Российской Федерации, ежемесячные значения
     * (DataSet)
     */
    public ru.cbr.web.MrrfResponseMrrfResult mrrf(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Международные резервы Российской Федерации, ежемесячные значения
     * (XMLDocument)
     */
    public ru.cbr.web.MrrfXMLResponseMrrfXMLResult mrrfXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Сальдо операций ЦБ РФ по предоставлению/абсорбированию ликвидности
     * (DataSet)
     */
    public ru.cbr.web.SaldoResponseSaldoResult saldo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Получение новостей сервера (XMLDocument)
     */
    public ru.cbr.web.NewsInfoXMLResponseNewsInfoXMLResult newsInfoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Операции на открытом рынке (как XMLDocument)
     */
    public ru.cbr.web.OmodInfoXMLResponseOmodInfoXMLResult omodInfoXML() throws java.rmi.RemoteException;

    /**
     * Операции Банка России на рынке государственных ценных бумаг
     * по поручению Министерства финансов Российской Федерации (как DataSet)
     */
    public ru.cbr.web.XVolResponseXVolResult XVol(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Операции Банка России на рынке государственных ценных бумаг
     * по поручению Министерства финансов Российской Федерации  (XMLDocument)
     */
    public ru.cbr.web.XVolXMLResponseXVolXMLResult XVolXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Получение основной информации - Ставка рефинансирования, золотовалютные
     * резервы, денежная база, денежная масса (как XMLDocument)
     */
    public ru.cbr.web.MainInfoXMLResponseMainInfoXMLResult mainInfoXML() throws java.rmi.RemoteException;

    /**
     * Получение всей оперативной информации (XmlDocument)
     */
    public ru.cbr.web.AllDataInfoXMLResponseAllDataInfoXMLResult allDataInfoXML() throws java.rmi.RemoteException;

    /**
     * Получение новостей сервера (DataSet)
     */
    public ru.cbr.web.NewsInfoResponseNewsInfoResult newsInfo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Валютный своп buy/sell overnight (XMLDocument)
     */
    public ru.cbr.web.SwapDynamicXMLResponseSwapDynamicXMLResult swapDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Условия заключения сделок «валютный своп» по продаже долларов
     * США за рубли (DataSet) ver 18.09.2014
     */
    public ru.cbr.web.SwapInfoSellUSDResponseSwapInfoSellUSDResult swapInfoSellUSD(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Условия заключения сделок «валютный своп» по продаже долларов
     * США за рубли (как xmlDocument)
     */
    public ru.cbr.web.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult swapInfoSellUSDXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Валютный своп buy/sell overnight (DataSet) ver 31.07.2012
     */
    public ru.cbr.web.SwapDynamicResponseSwapDynamicResult swapDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Объем сделок 'валютный своп' Банка России (DataSet) ver 03.04.2014
     */
    public ru.cbr.web.SwapMonthTotalResponseSwapMonthTotalResult swapMonthTotal(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Объем сделок 'валютный своп' Банка России (как xmlDocument)
     */
    public ru.cbr.web.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult swapMonthTotalXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставки межбанковского кредитного рынка  (DataSet) ver 31.07.2012
     */
    public ru.cbr.web.MKRResponseMKRResult MKR(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставки межбанковского кредитного рынка (как xmlDocument)
     */
    public ru.cbr.web.MKRXMLResponseMKRXMLResult MKRXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Требования Банка России к кредитным организациям (DataSet)
     * ver 31.07.2012
     */
    public ru.cbr.web.DVResponseDVResult DV(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Требования Банка России к кредитным организациям (как xmlDocument)
     */
    public ru.cbr.web.DVXMLResponseDVXMLResult DVXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Задолженность кредитных организаций перед Банком России по
     * операциям прямого РЕПО (DataSet) ver 18.06.2014
     */
    public ru.cbr.web.Repo_debtResponseRepo_debtResult repo_debt(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Задолженность кредитных организаций перед Банком России по
     * операциям прямого РЕПО (как xmlDocument)
     */
    public ru.cbr.web.Repo_debtXMLResponseRepo_debtXMLResult repo_debtXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Отпускные цены Банка России на инвестиционные монеты (DataSet)
     * ver 31.07.2012
     */
    public ru.cbr.web.Coins_baseResponseCoins_baseResult coins_base(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Отпускные цены Банка России на инвестиционные монеты (как xmlDocument)
     */
    public ru.cbr.web.Coins_baseXMLResponseCoins_baseXMLResult coins_baseXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Фиксинги на драгоценные металлы (DataSet) ver 31.07.2012
     */
    public ru.cbr.web.FixingBaseResponseFixingBaseResult fixingBase(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Фиксинги на драгоценные металлы (как xmlDocument)
     */
    public ru.cbr.web.FixingBaseXMLResponseFixingBaseXMLResult fixingBaseXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставки по кредиту 'overnight' (DataSet) ver 31.07.2012
     */
    public ru.cbr.web.OvernightResponseOvernightResult overnight(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Ставки по кредиту 'overnight' (как xmlDocument
     */
    public ru.cbr.web.OvernightXMLResponseOvernightXMLResult overnightXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * База данных по размещению бюджетных средств на депозиты коммерческих
     * банков (DataSet) ver 31.07.2012
     */
    public ru.cbr.web.BauctionResponseBauctionResult bauction(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * База данных по размещению бюджетных средств на депозиты коммерческих
     * банков (как xmlDocument
     */
    public ru.cbr.web.BauctionXMLResponseBauctionXMLResult bauctionXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Динамики ставок привлечения средств по депозитным операциям
     * (как xmlDocument
     */
    public ru.cbr.web.DepoDynamicXMLResponseDepoDynamicXMLResult depoDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Динамика ставок привлечения средств по депозитным операциям
     * (DataSet)
     */
    public ru.cbr.web.DepoDynamicResponseDepoDynamicResult depoDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Динамики сведений об остатках средств на корреспондентских
     * счетах кредитных организаций (XMLDocument).
     */
    public ru.cbr.web.OstatDynamicXMLResponseOstatDynamicXMLResult ostatDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Динамики сведений об остатках средств на корреспондентских
     * счетах кредитных организаций (DataSet)!
     */
    public ru.cbr.web.OstatDynamicResponseOstatDynamicResult ostatDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Динамика учетных цен драгоценных металлов (как XMLDocument)
     */
    public ru.cbr.web.DragMetDynamicXMLResponseDragMetDynamicXMLResult dragMetDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Динамика учетных цен драгоценных металлов (DataSet)
     */
    public ru.cbr.web.DragMetDynamicResponseDragMetDynamicResult dragMetDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;

    /**
     * Последняя дата публикации курсов валют как DateTime (ежедневные
     * валюты)
     */
    public java.util.Calendar getLatestDateTime() throws java.rmi.RemoteException;

    /**
     * Последняя дата публикации курсов валют(ежемесячные валюты)
     * - строка
     */
    public java.lang.String getLatestDate() throws java.rmi.RemoteException;

    /**
     * Последняя дата публикации курсов валют как DateTime (ежемесячные
     * валюты)
     */
    public java.util.Calendar getLatestDateTimeSeld() throws java.rmi.RemoteException;

    /**
     * Последняя дата публикации курсов валют (ежемесячные валюты)
     * - строка yyyyMMdd
     */
    public java.lang.String getLatestDateSeld() throws java.rmi.RemoteException;

    /**
     * Справочник по кодам валют (как XMLDocument)
     */
    public ru.cbr.web.EnumValutesXMLResponseEnumValutesXMLResult enumValutesXML(boolean seld) throws java.rmi.RemoteException;

    /**
     * Справочник по кодам валют (как DataSet)
     */
    public ru.cbr.web.EnumValutesResponseEnumValutesResult enumValutes(boolean seld) throws java.rmi.RemoteException;

    /**
     * Получение динамики ежедневных курсов валюты (как XMLDocument)
     */
    public ru.cbr.web.GetCursDynamicXMLResponseGetCursDynamicXMLResult getCursDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate, java.lang.String valutaCode) throws java.rmi.RemoteException;

    /**
     * Получение динамики ежедневных курсов валюты (как DataSet)
     */
    public ru.cbr.web.GetCursDynamicResponseGetCursDynamicResult getCursDynamic(java.util.Calendar fromDate, java.util.Calendar toDate, java.lang.String valutaCode) throws java.rmi.RemoteException;

    /**
     * Получение ежедневных курсов валют (как XMLDocument)
     */
    public ru.cbr.web.GetCursOnDateXMLResponseGetCursOnDateXMLResult getCursOnDateXML(java.util.Calendar on_date) throws java.rmi.RemoteException;

    /**
     * Получение ежемесячных курсов валют !*устаревший! (как XMLDocument)
     */
    public ru.cbr.web.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult getSeldCursOnDateXML(java.util.Calendar on_date) throws java.rmi.RemoteException;

    /**
     * Получение ежемесячных курсов валют !*устаревший! (как DataSet)
     */
    public ru.cbr.web.GetSeldCursOnDateResponseGetSeldCursOnDateResult getSeldCursOnDate(java.util.Calendar on_date) throws java.rmi.RemoteException;

    /**
     * Получение ежедневных курсов валют (как DataSet)
     */
    public ru.cbr.web.GetCursOnDateResponseGetCursOnDateResult getCursOnDate(java.util.Calendar on_date) throws java.rmi.RemoteException;
}
