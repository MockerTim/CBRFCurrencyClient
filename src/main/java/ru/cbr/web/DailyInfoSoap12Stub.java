/**
 * DailyInfoSoap12Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class DailyInfoSoap12Stub extends org.apache.axis.client.Stub implements ru.cbr.web.DailyInfoSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[57];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaldoXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SaldoXMLResponse>SaldoXMLResult"));
        oper.setReturnClass(ru.cbr.web.SaldoXMLResponseSaldoXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SaldoXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ROISfixXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ROISfixXMLResponse>ROISfixXMLResult"));
        oper.setReturnClass(ru.cbr.web.ROISfixXMLResponseROISfixXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ROISfixXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RuoniaXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RuoniaXMLResponse>RuoniaXMLResult"));
        oper.setReturnClass(ru.cbr.web.RuoniaXMLResponseRuoniaXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "RuoniaXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OstatDepoXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDepoXMLResponse>OstatDepoXMLResult"));
        oper.setReturnClass(ru.cbr.web.OstatDepoXMLResponseOstatDepoXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDepoXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OstatDepo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDepoResponse>OstatDepoResult"));
        oper.setReturnClass(ru.cbr.web.OstatDepoResponseOstatDepoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDepoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ROISfix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ROISfixResponse>ROISfixResult"));
        oper.setReturnClass(ru.cbr.web.ROISfixResponseROISfixResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ROISfixResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Ruonia");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RuoniaResponse>RuoniaResult"));
        oper.setReturnClass(ru.cbr.web.RuoniaResponseRuoniaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "RuoniaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mrrf7D");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrf7DResponse>mrrf7DResult"));
        oper.setReturnClass(ru.cbr.web.Mrrf7DResponseMrrf7DResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf7DResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mrrf7DXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrf7DXMLResponse>mrrf7DXMLResult"));
        oper.setReturnClass(ru.cbr.web.Mrrf7DXMLResponseMrrf7DXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf7DXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mrrf");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrfResponse>mrrfResult"));
        oper.setReturnClass(ru.cbr.web.MrrfResponseMrrfResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrfResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mrrfXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrfXMLResponse>mrrfXMLResult"));
        oper.setReturnClass(ru.cbr.web.MrrfXMLResponseMrrfXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrfXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Saldo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SaldoResponse>SaldoResult"));
        oper.setReturnClass(ru.cbr.web.SaldoResponseSaldoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SaldoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NewsInfoXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>NewsInfoXMLResponse>NewsInfoXMLResult"));
        oper.setReturnClass(ru.cbr.web.NewsInfoXMLResponseNewsInfoXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "NewsInfoXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OmodInfoXML");
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OmodInfoXMLResponse>OmodInfoXMLResult"));
        oper.setReturnClass(ru.cbr.web.OmodInfoXMLResponseOmodInfoXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OmodInfoXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("XVol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>XVolResponse>XVolResult"));
        oper.setReturnClass(ru.cbr.web.XVolResponseXVolResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "XVolResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("XVolXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>XVolXMLResponse>XVolXMLResult"));
        oper.setReturnClass(ru.cbr.web.XVolXMLResponseXVolXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "XVolXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MainInfoXML");
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MainInfoXMLResponse>MainInfoXMLResult"));
        oper.setReturnClass(ru.cbr.web.MainInfoXMLResponseMainInfoXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MainInfoXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllDataInfoXML");
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>AllDataInfoXMLResponse>AllDataInfoXMLResult"));
        oper.setReturnClass(ru.cbr.web.AllDataInfoXMLResponseAllDataInfoXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "AllDataInfoXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NewsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>NewsInfoResponse>NewsInfoResult"));
        oper.setReturnClass(ru.cbr.web.NewsInfoResponseNewsInfoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "NewsInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapDynamicXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDynamicXMLResponse>SwapDynamicXMLResult"));
        oper.setReturnClass(ru.cbr.web.SwapDynamicXMLResponseSwapDynamicXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDynamicXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapInfoSellUSD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDResponse>SwapInfoSellUSDResult"));
        oper.setReturnClass(ru.cbr.web.SwapInfoSellUSDResponseSwapInfoSellUSDResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapInfoSellUSDXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDXMLResponse>SwapInfoSellUSDXMLResult"));
        oper.setReturnClass(ru.cbr.web.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapDynamic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDynamicResponse>SwapDynamicResult"));
        oper.setReturnClass(ru.cbr.web.SwapDynamicResponseSwapDynamicResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDynamicResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapMonthTotal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapMonthTotalResponse>SwapMonthTotalResult"));
        oper.setReturnClass(ru.cbr.web.SwapMonthTotalResponseSwapMonthTotalResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapMonthTotalResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwapMonthTotalXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapMonthTotalXMLResponse>SwapMonthTotalXMLResult"));
        oper.setReturnClass(ru.cbr.web.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapMonthTotalXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MKR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MKRResponse>MKRResult"));
        oper.setReturnClass(ru.cbr.web.MKRResponseMKRResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MKRResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MKRXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MKRXMLResponse>MKRXMLResult"));
        oper.setReturnClass(ru.cbr.web.MKRXMLResponseMKRXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MKRXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DV");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DVResponse>DVResult"));
        oper.setReturnClass(ru.cbr.web.DVResponseDVResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DVResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DVXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DVXMLResponse>DVXMLResult"));
        oper.setReturnClass(ru.cbr.web.DVXMLResponseDVXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DVXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Repo_debt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Repo_debtResponse>Repo_debtResult"));
        oper.setReturnClass(ru.cbr.web.Repo_debtResponseRepo_debtResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Repo_debtResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Repo_debtXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Repo_debtXMLResponse>Repo_debtXMLResult"));
        oper.setReturnClass(ru.cbr.web.Repo_debtXMLResponseRepo_debtXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Repo_debtXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Coins_base");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Coins_baseResponse>Coins_baseResult"));
        oper.setReturnClass(ru.cbr.web.Coins_baseResponseCoins_baseResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Coins_baseResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Coins_baseXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Coins_baseXMLResponse>Coins_baseXMLResult"));
        oper.setReturnClass(ru.cbr.web.Coins_baseXMLResponseCoins_baseXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Coins_baseXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FixingBase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>FixingBaseResponse>FixingBaseResult"));
        oper.setReturnClass(ru.cbr.web.FixingBaseResponseFixingBaseResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "FixingBaseResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FixingBaseXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>FixingBaseXMLResponse>FixingBaseXMLResult"));
        oper.setReturnClass(ru.cbr.web.FixingBaseXMLResponseFixingBaseXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "FixingBaseXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Overnight");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OvernightResponse>OvernightResult"));
        oper.setReturnClass(ru.cbr.web.OvernightResponseOvernightResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OvernightResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OvernightXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OvernightXMLResponse>OvernightXMLResult"));
        oper.setReturnClass(ru.cbr.web.OvernightXMLResponseOvernightXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OvernightXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Bauction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BauctionResponse>BauctionResult"));
        oper.setReturnClass(ru.cbr.web.BauctionResponseBauctionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BauctionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BauctionXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BauctionXMLResponse>BauctionXMLResult"));
        oper.setReturnClass(ru.cbr.web.BauctionXMLResponseBauctionXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BauctionXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DepoDynamicXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DepoDynamicXMLResponse>DepoDynamicXMLResult"));
        oper.setReturnClass(ru.cbr.web.DepoDynamicXMLResponseDepoDynamicXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DepoDynamicXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DepoDynamic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DepoDynamicResponse>DepoDynamicResult"));
        oper.setReturnClass(ru.cbr.web.DepoDynamicResponseDepoDynamicResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DepoDynamicResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OstatDynamicXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDynamicXMLResponse>OstatDynamicXMLResult"));
        oper.setReturnClass(ru.cbr.web.OstatDynamicXMLResponseOstatDynamicXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDynamicXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OstatDynamic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDynamicResponse>OstatDynamicResult"));
        oper.setReturnClass(ru.cbr.web.OstatDynamicResponseOstatDynamicResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDynamicResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DragMetDynamicXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DragMetDynamicXMLResponse>DragMetDynamicXMLResult"));
        oper.setReturnClass(ru.cbr.web.DragMetDynamicXMLResponseDragMetDynamicXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DragMetDynamicXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DragMetDynamic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DragMetDynamicResponse>DragMetDynamicResult"));
        oper.setReturnClass(ru.cbr.web.DragMetDynamicResponseDragMetDynamicResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DragMetDynamicResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLatestDateTime");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        oper.setReturnClass(java.util.Calendar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateTimeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLatestDate");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLatestDateTimeSeld");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        oper.setReturnClass(java.util.Calendar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateTimeSeldResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLatestDateSeld");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateSeldResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnumValutesXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "Seld"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumValutesXMLResponse>EnumValutesXMLResult"));
        oper.setReturnClass(ru.cbr.web.EnumValutesXMLResponseEnumValutesXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumValutesXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EnumValutes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "Seld"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumValutesResponse>EnumValutesResult"));
        oper.setReturnClass(ru.cbr.web.EnumValutesResponseEnumValutesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumValutesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCursDynamicXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "FromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ValutaCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursDynamicXMLResponse>GetCursDynamicXMLResult"));
        oper.setReturnClass(ru.cbr.web.GetCursDynamicXMLResponseGetCursDynamicXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursDynamicXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCursDynamic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "FromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ValutaCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursDynamicResponse>GetCursDynamicResult"));
        oper.setReturnClass(ru.cbr.web.GetCursDynamicResponseGetCursDynamicResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursDynamicResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCursOnDateXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursOnDateXMLResponse>GetCursOnDateXMLResult"));
        oper.setReturnClass(ru.cbr.web.GetCursOnDateXMLResponseGetCursOnDateXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursOnDateXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSeldCursOnDateXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetSeldCursOnDateXMLResponse>GetSeldCursOnDateXMLResult"));
        oper.setReturnClass(ru.cbr.web.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetSeldCursOnDateXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSeldCursOnDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetSeldCursOnDateResponse>GetSeldCursOnDateResult"));
        oper.setReturnClass(ru.cbr.web.GetSeldCursOnDateResponseGetSeldCursOnDateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetSeldCursOnDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCursOnDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursOnDateResponse>GetCursOnDateResult"));
        oper.setReturnClass(ru.cbr.web.GetCursOnDateResponseGetCursOnDateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursOnDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

    }

    public DailyInfoSoap12Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DailyInfoSoap12Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DailyInfoSoap12Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>AllDataInfoXMLResponse>AllDataInfoXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.AllDataInfoXMLResponseAllDataInfoXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BauctionResponse>BauctionResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.BauctionResponseBauctionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BauctionXMLResponse>BauctionXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.BauctionXMLResponseBauctionXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Coins_baseResponse>Coins_baseResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Coins_baseResponseCoins_baseResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Coins_baseXMLResponse>Coins_baseXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Coins_baseXMLResponseCoins_baseXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DepoDynamicResponse>DepoDynamicResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DepoDynamicResponseDepoDynamicResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DepoDynamicXMLResponse>DepoDynamicXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DepoDynamicXMLResponseDepoDynamicXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DragMetDynamicResponse>DragMetDynamicResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DragMetDynamicResponseDragMetDynamicResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DragMetDynamicXMLResponse>DragMetDynamicXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DragMetDynamicXMLResponseDragMetDynamicXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DVResponse>DVResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DVResponseDVResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DVXMLResponse>DVXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DVXMLResponseDVXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumValutesResponse>EnumValutesResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.EnumValutesResponseEnumValutesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumValutesXMLResponse>EnumValutesXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.EnumValutesXMLResponseEnumValutesXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>FixingBaseResponse>FixingBaseResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.FixingBaseResponseFixingBaseResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>FixingBaseXMLResponse>FixingBaseXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.FixingBaseXMLResponseFixingBaseXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursDynamicResponse>GetCursDynamicResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetCursDynamicResponseGetCursDynamicResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursDynamicXMLResponse>GetCursDynamicXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetCursDynamicXMLResponseGetCursDynamicXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursOnDateResponse>GetCursOnDateResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetCursOnDateResponseGetCursOnDateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursOnDateXMLResponse>GetCursOnDateXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetCursOnDateXMLResponseGetCursOnDateXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetSeldCursOnDateResponse>GetSeldCursOnDateResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetSeldCursOnDateResponseGetSeldCursOnDateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetSeldCursOnDateXMLResponse>GetSeldCursOnDateXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MainInfoXMLResponse>MainInfoXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.MainInfoXMLResponseMainInfoXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MKRResponse>MKRResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.MKRResponseMKRResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MKRXMLResponse>MKRXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.MKRXMLResponseMKRXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrf7DResponse>mrrf7DResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Mrrf7DResponseMrrf7DResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrf7DXMLResponse>mrrf7DXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Mrrf7DXMLResponseMrrf7DXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrfResponse>mrrfResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.MrrfResponseMrrfResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrfXMLResponse>mrrfXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.MrrfXMLResponseMrrfXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>NewsInfoResponse>NewsInfoResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.NewsInfoResponseNewsInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>NewsInfoXMLResponse>NewsInfoXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.NewsInfoXMLResponseNewsInfoXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OmodInfoXMLResponse>OmodInfoXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OmodInfoXMLResponseOmodInfoXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDepoResponse>OstatDepoResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OstatDepoResponseOstatDepoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDepoXMLResponse>OstatDepoXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OstatDepoXMLResponseOstatDepoXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDynamicResponse>OstatDynamicResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OstatDynamicResponseOstatDynamicResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDynamicXMLResponse>OstatDynamicXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OstatDynamicXMLResponseOstatDynamicXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OvernightResponse>OvernightResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OvernightResponseOvernightResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OvernightXMLResponse>OvernightXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OvernightXMLResponseOvernightXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Repo_debtResponse>Repo_debtResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Repo_debtResponseRepo_debtResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Repo_debtXMLResponse>Repo_debtXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Repo_debtXMLResponseRepo_debtXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ROISfixResponse>ROISfixResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.ROISfixResponseROISfixResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ROISfixXMLResponse>ROISfixXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.ROISfixXMLResponseROISfixXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RuoniaResponse>RuoniaResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.RuoniaResponseRuoniaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RuoniaXMLResponse>RuoniaXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.RuoniaXMLResponseRuoniaXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SaldoResponse>SaldoResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SaldoResponseSaldoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SaldoXMLResponse>SaldoXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SaldoXMLResponseSaldoXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDynamicResponse>SwapDynamicResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapDynamicResponseSwapDynamicResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDynamicXMLResponse>SwapDynamicXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapDynamicXMLResponseSwapDynamicXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDResponse>SwapInfoSellUSDResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapInfoSellUSDResponseSwapInfoSellUSDResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDXMLResponse>SwapInfoSellUSDXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapMonthTotalResponse>SwapMonthTotalResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapMonthTotalResponseSwapMonthTotalResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapMonthTotalXMLResponse>SwapMonthTotalXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>XVolResponse>XVolResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.XVolResponseXVolResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">>XVolXMLResponse>XVolXMLResult");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.XVolXMLResponseXVolXMLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">AllDataInfoXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.AllDataInfoXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">AllDataInfoXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.AllDataInfoXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Bauction");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Bauction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">BauctionResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.BauctionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">BauctionXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.BauctionXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">BauctionXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.BauctionXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Coins_base");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Coins_base.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Coins_baseResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Coins_baseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Coins_baseXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Coins_baseXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Coins_baseXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Coins_baseXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DepoDynamic");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DepoDynamic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DepoDynamicResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DepoDynamicResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DepoDynamicXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DepoDynamicXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DepoDynamicXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DepoDynamicXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DragMetDynamic");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DragMetDynamic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DragMetDynamicResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DragMetDynamicResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DragMetDynamicXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DragMetDynamicXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DragMetDynamicXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DragMetDynamicXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DV");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DV.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DVResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DVResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DVXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DVXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">DVXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.DVXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">EnumValutes");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.EnumValutes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">EnumValutesResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.EnumValutesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">EnumValutesXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.EnumValutesXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">EnumValutesXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.EnumValutesXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">FixingBase");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.FixingBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">FixingBaseResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.FixingBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">FixingBaseXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.FixingBaseXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">FixingBaseXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.FixingBaseXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursDynamic");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetCursDynamic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursDynamicResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetCursDynamicResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursDynamicXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetCursDynamicXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursDynamicXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetCursDynamicXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursOnDate");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetCursOnDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursOnDateResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetCursOnDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursOnDateXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetCursOnDateXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursOnDateXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetCursOnDateXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDate");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetLatestDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetLatestDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateSeld");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetLatestDateSeld.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateSeldResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetLatestDateSeldResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateTime");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetLatestDateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateTimeResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetLatestDateTimeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateTimeSeld");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetLatestDateTimeSeld.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateTimeSeldResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetLatestDateTimeSeldResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetSeldCursOnDate");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetSeldCursOnDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetSeldCursOnDateResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetSeldCursOnDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetSeldCursOnDateXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetSeldCursOnDateXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetSeldCursOnDateXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.GetSeldCursOnDateXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">MainInfoXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.MainInfoXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">MainInfoXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.MainInfoXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">MKR");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.MKR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">MKRResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.MKRResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">MKRXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.MKRXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">MKRXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.MKRXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrf");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Mrrf.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrf7D");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Mrrf7D.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrf7DResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Mrrf7DResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrf7DXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Mrrf7DXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrf7DXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Mrrf7DXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrfResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.MrrfResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrfXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.MrrfXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrfXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.MrrfXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">NewsInfo");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.NewsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">NewsInfoResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.NewsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">NewsInfoXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.NewsInfoXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">NewsInfoXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.NewsInfoXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OmodInfoXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OmodInfoXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OmodInfoXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OmodInfoXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDepo");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OstatDepo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDepoResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OstatDepoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDepoXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OstatDepoXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDepoXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OstatDepoXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDynamic");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OstatDynamic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDynamicResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OstatDynamicResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDynamicXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OstatDynamicXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDynamicXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OstatDynamicXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Overnight");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Overnight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OvernightResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OvernightResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OvernightXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OvernightXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">OvernightXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.OvernightXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Repo_debt");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Repo_debt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Repo_debtResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Repo_debtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Repo_debtXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Repo_debtXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Repo_debtXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Repo_debtXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">ROISfix");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.ROISfix.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">ROISfixResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.ROISfixResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">ROISfixXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.ROISfixXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">ROISfixXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.ROISfixXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Ruonia");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Ruonia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">RuoniaResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.RuoniaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">RuoniaXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.RuoniaXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">RuoniaXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.RuoniaXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">Saldo");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.Saldo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SaldoResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SaldoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDynamic");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapDynamic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDynamicResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapDynamicResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDynamicXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapDynamicXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDynamicXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapDynamicXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSD");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapInfoSellUSD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSDResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapInfoSellUSDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSDXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapInfoSellUSDXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSDXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapInfoSellUSDXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapMonthTotal");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapMonthTotal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapMonthTotalResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapMonthTotalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapMonthTotalXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapMonthTotalXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapMonthTotalXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.SwapMonthTotalXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">XVol");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.XVol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">XVolResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.XVolResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">XVolXML");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.XVolXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://web.cbr.ru/", ">XVolXMLResponse");
            cachedSerQNames.add(qName);
            cls = ru.cbr.web.XVolXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public ru.cbr.web.SaldoXMLResponseSaldoXMLResult saldoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SaldoXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SaldoXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.SaldoXMLResponseSaldoXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.SaldoXMLResponseSaldoXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.SaldoXMLResponseSaldoXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.ROISfixXMLResponseROISfixXMLResult ROISfixXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/ROISfixXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ROISfixXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.ROISfixXMLResponseROISfixXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.ROISfixXMLResponseROISfixXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.ROISfixXMLResponseROISfixXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.RuoniaXMLResponseRuoniaXMLResult ruoniaXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/RuoniaXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "RuoniaXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.RuoniaXMLResponseRuoniaXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.RuoniaXMLResponseRuoniaXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.RuoniaXMLResponseRuoniaXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.OstatDepoXMLResponseOstatDepoXMLResult ostatDepoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/OstatDepoXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDepoXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.OstatDepoXMLResponseOstatDepoXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.OstatDepoXMLResponseOstatDepoXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.OstatDepoXMLResponseOstatDepoXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.OstatDepoResponseOstatDepoResult ostatDepo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/OstatDepo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDepo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.OstatDepoResponseOstatDepoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.OstatDepoResponseOstatDepoResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.OstatDepoResponseOstatDepoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.ROISfixResponseROISfixResult ROISfix(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/ROISfix");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ROISfix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.ROISfixResponseROISfixResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.ROISfixResponseROISfixResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.ROISfixResponseROISfixResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.RuoniaResponseRuoniaResult ruonia(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Ruonia");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Ruonia"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.RuoniaResponseRuoniaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.RuoniaResponseRuoniaResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.RuoniaResponseRuoniaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.Mrrf7DResponseMrrf7DResult mrrf7D(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/mrrf7D");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf7D"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.Mrrf7DResponseMrrf7DResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.Mrrf7DResponseMrrf7DResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.Mrrf7DResponseMrrf7DResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.Mrrf7DXMLResponseMrrf7DXMLResult mrrf7DXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/mrrf7DXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf7DXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.Mrrf7DXMLResponseMrrf7DXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.Mrrf7DXMLResponseMrrf7DXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.Mrrf7DXMLResponseMrrf7DXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.MrrfResponseMrrfResult mrrf(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/mrrf");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.MrrfResponseMrrfResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.MrrfResponseMrrfResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.MrrfResponseMrrfResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.MrrfXMLResponseMrrfXMLResult mrrfXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/mrrfXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrfXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.MrrfXMLResponseMrrfXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.MrrfXMLResponseMrrfXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.MrrfXMLResponseMrrfXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.SaldoResponseSaldoResult saldo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Saldo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Saldo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.SaldoResponseSaldoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.SaldoResponseSaldoResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.SaldoResponseSaldoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.NewsInfoXMLResponseNewsInfoXMLResult newsInfoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/NewsInfoXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "NewsInfoXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.NewsInfoXMLResponseNewsInfoXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.NewsInfoXMLResponseNewsInfoXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.NewsInfoXMLResponseNewsInfoXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.OmodInfoXMLResponseOmodInfoXMLResult omodInfoXML() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/OmodInfoXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OmodInfoXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.OmodInfoXMLResponseOmodInfoXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.OmodInfoXMLResponseOmodInfoXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.OmodInfoXMLResponseOmodInfoXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.XVolResponseXVolResult XVol(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/XVol");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "XVol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.XVolResponseXVolResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.XVolResponseXVolResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.XVolResponseXVolResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.XVolXMLResponseXVolXMLResult XVolXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/XVolXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "XVolXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.XVolXMLResponseXVolXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.XVolXMLResponseXVolXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.XVolXMLResponseXVolXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.MainInfoXMLResponseMainInfoXMLResult mainInfoXML() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/MainInfoXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MainInfoXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.MainInfoXMLResponseMainInfoXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.MainInfoXMLResponseMainInfoXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.MainInfoXMLResponseMainInfoXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.AllDataInfoXMLResponseAllDataInfoXMLResult allDataInfoXML() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/AllDataInfoXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "AllDataInfoXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.AllDataInfoXMLResponseAllDataInfoXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.AllDataInfoXMLResponseAllDataInfoXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.AllDataInfoXMLResponseAllDataInfoXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.NewsInfoResponseNewsInfoResult newsInfo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/NewsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "NewsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.NewsInfoResponseNewsInfoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.NewsInfoResponseNewsInfoResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.NewsInfoResponseNewsInfoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.SwapDynamicXMLResponseSwapDynamicXMLResult swapDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapDynamicXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDynamicXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.SwapDynamicXMLResponseSwapDynamicXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.SwapDynamicXMLResponseSwapDynamicXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.SwapDynamicXMLResponseSwapDynamicXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.SwapInfoSellUSDResponseSwapInfoSellUSDResult swapInfoSellUSD(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapInfoSellUSD");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.SwapInfoSellUSDResponseSwapInfoSellUSDResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.SwapInfoSellUSDResponseSwapInfoSellUSDResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.SwapInfoSellUSDResponseSwapInfoSellUSDResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult swapInfoSellUSDXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapInfoSellUSDXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.SwapDynamicResponseSwapDynamicResult swapDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapDynamic");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDynamic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.SwapDynamicResponseSwapDynamicResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.SwapDynamicResponseSwapDynamicResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.SwapDynamicResponseSwapDynamicResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.SwapMonthTotalResponseSwapMonthTotalResult swapMonthTotal(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapMonthTotal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapMonthTotal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.SwapMonthTotalResponseSwapMonthTotalResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.SwapMonthTotalResponseSwapMonthTotalResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.SwapMonthTotalResponseSwapMonthTotalResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult swapMonthTotalXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/SwapMonthTotalXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapMonthTotalXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.MKRResponseMKRResult MKR(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/MKR");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MKR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.MKRResponseMKRResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.MKRResponseMKRResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.MKRResponseMKRResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.MKRXMLResponseMKRXMLResult MKRXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/MKRXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MKRXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.MKRXMLResponseMKRXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.MKRXMLResponseMKRXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.MKRXMLResponseMKRXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.DVResponseDVResult DV(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/DV");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DV"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.DVResponseDVResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.DVResponseDVResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.DVResponseDVResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.DVXMLResponseDVXMLResult DVXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/DVXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DVXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.DVXMLResponseDVXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.DVXMLResponseDVXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.DVXMLResponseDVXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.Repo_debtResponseRepo_debtResult repo_debt(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Repo_debt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Repo_debt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.Repo_debtResponseRepo_debtResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.Repo_debtResponseRepo_debtResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.Repo_debtResponseRepo_debtResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.Repo_debtXMLResponseRepo_debtXMLResult repo_debtXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Repo_debtXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Repo_debtXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.Repo_debtXMLResponseRepo_debtXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.Repo_debtXMLResponseRepo_debtXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.Repo_debtXMLResponseRepo_debtXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.Coins_baseResponseCoins_baseResult coins_base(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Coins_base");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Coins_base"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.Coins_baseResponseCoins_baseResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.Coins_baseResponseCoins_baseResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.Coins_baseResponseCoins_baseResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.Coins_baseXMLResponseCoins_baseXMLResult coins_baseXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Coins_baseXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Coins_baseXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.Coins_baseXMLResponseCoins_baseXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.Coins_baseXMLResponseCoins_baseXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.Coins_baseXMLResponseCoins_baseXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.FixingBaseResponseFixingBaseResult fixingBase(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/FixingBase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "FixingBase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.FixingBaseResponseFixingBaseResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.FixingBaseResponseFixingBaseResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.FixingBaseResponseFixingBaseResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.FixingBaseXMLResponseFixingBaseXMLResult fixingBaseXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/FixingBaseXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "FixingBaseXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.FixingBaseXMLResponseFixingBaseXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.FixingBaseXMLResponseFixingBaseXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.FixingBaseXMLResponseFixingBaseXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.OvernightResponseOvernightResult overnight(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Overnight");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Overnight"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.OvernightResponseOvernightResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.OvernightResponseOvernightResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.OvernightResponseOvernightResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.OvernightXMLResponseOvernightXMLResult overnightXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/OvernightXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OvernightXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.OvernightXMLResponseOvernightXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.OvernightXMLResponseOvernightXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.OvernightXMLResponseOvernightXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.BauctionResponseBauctionResult bauction(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/Bauction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Bauction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.BauctionResponseBauctionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.BauctionResponseBauctionResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.BauctionResponseBauctionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.BauctionXMLResponseBauctionXMLResult bauctionXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/BauctionXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BauctionXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.BauctionXMLResponseBauctionXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.BauctionXMLResponseBauctionXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.BauctionXMLResponseBauctionXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.DepoDynamicXMLResponseDepoDynamicXMLResult depoDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/DepoDynamicXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DepoDynamicXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.DepoDynamicXMLResponseDepoDynamicXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.DepoDynamicXMLResponseDepoDynamicXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.DepoDynamicXMLResponseDepoDynamicXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.DepoDynamicResponseDepoDynamicResult depoDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/DepoDynamic");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DepoDynamic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.DepoDynamicResponseDepoDynamicResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.DepoDynamicResponseDepoDynamicResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.DepoDynamicResponseDepoDynamicResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.OstatDynamicXMLResponseOstatDynamicXMLResult ostatDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/OstatDynamicXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDynamicXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.OstatDynamicXMLResponseOstatDynamicXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.OstatDynamicXMLResponseOstatDynamicXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.OstatDynamicXMLResponseOstatDynamicXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.OstatDynamicResponseOstatDynamicResult ostatDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/OstatDynamic");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDynamic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.OstatDynamicResponseOstatDynamicResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.OstatDynamicResponseOstatDynamicResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.OstatDynamicResponseOstatDynamicResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.DragMetDynamicXMLResponseDragMetDynamicXMLResult dragMetDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/DragMetDynamicXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DragMetDynamicXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.DragMetDynamicXMLResponseDragMetDynamicXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.DragMetDynamicXMLResponseDragMetDynamicXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.DragMetDynamicXMLResponseDragMetDynamicXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.DragMetDynamicResponseDragMetDynamicResult dragMetDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/DragMetDynamic");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DragMetDynamic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.DragMetDynamicResponseDragMetDynamicResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.DragMetDynamicResponseDragMetDynamicResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.DragMetDynamicResponseDragMetDynamicResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.util.Calendar getLatestDateTime() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetLatestDateTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Calendar) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Calendar) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Calendar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getLatestDate() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetLatestDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.util.Calendar getLatestDateTimeSeld() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetLatestDateTimeSeld");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateTimeSeld"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Calendar) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Calendar) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Calendar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getLatestDateSeld() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetLatestDateSeld");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateSeld"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.EnumValutesXMLResponseEnumValutesXMLResult enumValutesXML(boolean seld) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/EnumValutesXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumValutesXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(seld)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.EnumValutesXMLResponseEnumValutesXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.EnumValutesXMLResponseEnumValutesXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.EnumValutesXMLResponseEnumValutesXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.EnumValutesResponseEnumValutesResult enumValutes(boolean seld) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/EnumValutes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumValutes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(seld)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.EnumValutesResponseEnumValutesResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.EnumValutesResponseEnumValutesResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.EnumValutesResponseEnumValutesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.GetCursDynamicXMLResponseGetCursDynamicXMLResult getCursDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate, java.lang.String valutaCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetCursDynamicXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursDynamicXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate, valutaCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.GetCursDynamicXMLResponseGetCursDynamicXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.GetCursDynamicXMLResponseGetCursDynamicXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.GetCursDynamicXMLResponseGetCursDynamicXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.GetCursDynamicResponseGetCursDynamicResult getCursDynamic(java.util.Calendar fromDate, java.util.Calendar toDate, java.lang.String valutaCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetCursDynamic");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursDynamic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fromDate, toDate, valutaCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.GetCursDynamicResponseGetCursDynamicResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.GetCursDynamicResponseGetCursDynamicResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.GetCursDynamicResponseGetCursDynamicResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.GetCursOnDateXMLResponseGetCursOnDateXMLResult getCursOnDateXML(java.util.Calendar on_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetCursOnDateXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursOnDateXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {on_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.GetCursOnDateXMLResponseGetCursOnDateXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.GetCursOnDateXMLResponseGetCursOnDateXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.GetCursOnDateXMLResponseGetCursOnDateXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult getSeldCursOnDateXML(java.util.Calendar on_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetSeldCursOnDateXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetSeldCursOnDateXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {on_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.GetSeldCursOnDateResponseGetSeldCursOnDateResult getSeldCursOnDate(java.util.Calendar on_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetSeldCursOnDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetSeldCursOnDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {on_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.GetSeldCursOnDateResponseGetSeldCursOnDateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.GetSeldCursOnDateResponseGetSeldCursOnDateResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.GetSeldCursOnDateResponseGetSeldCursOnDateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ru.cbr.web.GetCursOnDateResponseGetCursOnDateResult getCursOnDate(java.util.Calendar on_date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://web.cbr.ru/GetCursOnDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursOnDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {on_date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ru.cbr.web.GetCursOnDateResponseGetCursOnDateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (ru.cbr.web.GetCursOnDateResponseGetCursOnDateResult) org.apache.axis.utils.JavaUtils.convert(_resp, ru.cbr.web.GetCursOnDateResponseGetCursOnDateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
