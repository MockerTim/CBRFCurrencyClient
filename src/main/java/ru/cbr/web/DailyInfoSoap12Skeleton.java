/**
 * DailyInfoSoap12Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class DailyInfoSoap12Skeleton implements ru.cbr.web.DailyInfoSoap, org.apache.axis.wsdl.Skeleton {
    private ru.cbr.web.DailyInfoSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("saldoXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "SaldoXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SaldoXMLResponse>SaldoXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SaldoXML"));
        _oper.setSoapAction("http://web.cbr.ru/SaldoXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("saldoXML") == null) {
            _myOperations.put("saldoXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("saldoXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ROISfixXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "ROISfixXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ROISfixXMLResponse>ROISfixXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ROISfixXML"));
        _oper.setSoapAction("http://web.cbr.ru/ROISfixXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ROISfixXML") == null) {
            _myOperations.put("ROISfixXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ROISfixXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ruoniaXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "RuoniaXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RuoniaXMLResponse>RuoniaXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "RuoniaXML"));
        _oper.setSoapAction("http://web.cbr.ru/RuoniaXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ruoniaXML") == null) {
            _myOperations.put("ruoniaXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ruoniaXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ostatDepoXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDepoXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDepoXMLResponse>OstatDepoXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDepoXML"));
        _oper.setSoapAction("http://web.cbr.ru/OstatDepoXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ostatDepoXML") == null) {
            _myOperations.put("ostatDepoXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ostatDepoXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ostatDepo", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDepoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDepoResponse>OstatDepoResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDepo"));
        _oper.setSoapAction("http://web.cbr.ru/OstatDepo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ostatDepo") == null) {
            _myOperations.put("ostatDepo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ostatDepo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ROISfix", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "ROISfixResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ROISfixResponse>ROISfixResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ROISfix"));
        _oper.setSoapAction("http://web.cbr.ru/ROISfix");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ROISfix") == null) {
            _myOperations.put("ROISfix", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ROISfix")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ruonia", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "RuoniaResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RuoniaResponse>RuoniaResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Ruonia"));
        _oper.setSoapAction("http://web.cbr.ru/Ruonia");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ruonia") == null) {
            _myOperations.put("ruonia", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ruonia")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mrrf7D", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf7DResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrf7DResponse>mrrf7DResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf7D"));
        _oper.setSoapAction("http://web.cbr.ru/mrrf7D");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mrrf7D") == null) {
            _myOperations.put("mrrf7D", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mrrf7D")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mrrf7DXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf7DXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrf7DXMLResponse>mrrf7DXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf7DXML"));
        _oper.setSoapAction("http://web.cbr.ru/mrrf7DXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mrrf7DXML") == null) {
            _myOperations.put("mrrf7DXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mrrf7DXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mrrf", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrfResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrfResponse>mrrfResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf"));
        _oper.setSoapAction("http://web.cbr.ru/mrrf");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mrrf") == null) {
            _myOperations.put("mrrf", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mrrf")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mrrfXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrfXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrfXMLResponse>mrrfXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrfXML"));
        _oper.setSoapAction("http://web.cbr.ru/mrrfXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mrrfXML") == null) {
            _myOperations.put("mrrfXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mrrfXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("saldo", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "SaldoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SaldoResponse>SaldoResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Saldo"));
        _oper.setSoapAction("http://web.cbr.ru/Saldo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("saldo") == null) {
            _myOperations.put("saldo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("saldo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("newsInfoXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "NewsInfoXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>NewsInfoXMLResponse>NewsInfoXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "NewsInfoXML"));
        _oper.setSoapAction("http://web.cbr.ru/NewsInfoXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("newsInfoXML") == null) {
            _myOperations.put("newsInfoXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("newsInfoXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("omodInfoXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "OmodInfoXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OmodInfoXMLResponse>OmodInfoXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OmodInfoXML"));
        _oper.setSoapAction("http://web.cbr.ru/OmodInfoXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("omodInfoXML") == null) {
            _myOperations.put("omodInfoXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("omodInfoXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("XVol", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "XVolResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>XVolResponse>XVolResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "XVol"));
        _oper.setSoapAction("http://web.cbr.ru/XVol");
        _myOperationsList.add(_oper);
        if (_myOperations.get("XVol") == null) {
            _myOperations.put("XVol", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("XVol")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("XVolXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "XVolXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>XVolXMLResponse>XVolXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "XVolXML"));
        _oper.setSoapAction("http://web.cbr.ru/XVolXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("XVolXML") == null) {
            _myOperations.put("XVolXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("XVolXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("mainInfoXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "MainInfoXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MainInfoXMLResponse>MainInfoXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MainInfoXML"));
        _oper.setSoapAction("http://web.cbr.ru/MainInfoXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mainInfoXML") == null) {
            _myOperations.put("mainInfoXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mainInfoXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("allDataInfoXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "AllDataInfoXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>AllDataInfoXMLResponse>AllDataInfoXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "AllDataInfoXML"));
        _oper.setSoapAction("http://web.cbr.ru/AllDataInfoXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("allDataInfoXML") == null) {
            _myOperations.put("allDataInfoXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("allDataInfoXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("newsInfo", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "NewsInfoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>NewsInfoResponse>NewsInfoResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "NewsInfo"));
        _oper.setSoapAction("http://web.cbr.ru/NewsInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("newsInfo") == null) {
            _myOperations.put("newsInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("newsInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("swapDynamicXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDynamicXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDynamicXMLResponse>SwapDynamicXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDynamicXML"));
        _oper.setSoapAction("http://web.cbr.ru/SwapDynamicXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("swapDynamicXML") == null) {
            _myOperations.put("swapDynamicXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("swapDynamicXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("swapInfoSellUSD", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDResponse>SwapInfoSellUSDResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSD"));
        _oper.setSoapAction("http://web.cbr.ru/SwapInfoSellUSD");
        _myOperationsList.add(_oper);
        if (_myOperations.get("swapInfoSellUSD") == null) {
            _myOperations.put("swapInfoSellUSD", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("swapInfoSellUSD")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("swapInfoSellUSDXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDXMLResponse>SwapInfoSellUSDXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDXML"));
        _oper.setSoapAction("http://web.cbr.ru/SwapInfoSellUSDXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("swapInfoSellUSDXML") == null) {
            _myOperations.put("swapInfoSellUSDXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("swapInfoSellUSDXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("swapDynamic", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDynamicResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDynamicResponse>SwapDynamicResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDynamic"));
        _oper.setSoapAction("http://web.cbr.ru/SwapDynamic");
        _myOperationsList.add(_oper);
        if (_myOperations.get("swapDynamic") == null) {
            _myOperations.put("swapDynamic", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("swapDynamic")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("swapMonthTotal", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapMonthTotalResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapMonthTotalResponse>SwapMonthTotalResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapMonthTotal"));
        _oper.setSoapAction("http://web.cbr.ru/SwapMonthTotal");
        _myOperationsList.add(_oper);
        if (_myOperations.get("swapMonthTotal") == null) {
            _myOperations.put("swapMonthTotal", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("swapMonthTotal")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("swapMonthTotalXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapMonthTotalXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapMonthTotalXMLResponse>SwapMonthTotalXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapMonthTotalXML"));
        _oper.setSoapAction("http://web.cbr.ru/SwapMonthTotalXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("swapMonthTotalXML") == null) {
            _myOperations.put("swapMonthTotalXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("swapMonthTotalXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("MKR", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "MKRResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MKRResponse>MKRResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MKR"));
        _oper.setSoapAction("http://web.cbr.ru/MKR");
        _myOperationsList.add(_oper);
        if (_myOperations.get("MKR") == null) {
            _myOperations.put("MKR", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("MKR")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("MKRXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "MKRXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MKRXMLResponse>MKRXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MKRXML"));
        _oper.setSoapAction("http://web.cbr.ru/MKRXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("MKRXML") == null) {
            _myOperations.put("MKRXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("MKRXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("DV", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "DVResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DVResponse>DVResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DV"));
        _oper.setSoapAction("http://web.cbr.ru/DV");
        _myOperationsList.add(_oper);
        if (_myOperations.get("DV") == null) {
            _myOperations.put("DV", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("DV")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("DVXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "DVXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DVXMLResponse>DVXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DVXML"));
        _oper.setSoapAction("http://web.cbr.ru/DVXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("DVXML") == null) {
            _myOperations.put("DVXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("DVXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("repo_debt", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "Repo_debtResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Repo_debtResponse>Repo_debtResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Repo_debt"));
        _oper.setSoapAction("http://web.cbr.ru/Repo_debt");
        _myOperationsList.add(_oper);
        if (_myOperations.get("repo_debt") == null) {
            _myOperations.put("repo_debt", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("repo_debt")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("repo_debtXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "Repo_debtXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Repo_debtXMLResponse>Repo_debtXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Repo_debtXML"));
        _oper.setSoapAction("http://web.cbr.ru/Repo_debtXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("repo_debtXML") == null) {
            _myOperations.put("repo_debtXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("repo_debtXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("coins_base", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "Coins_baseResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Coins_baseResponse>Coins_baseResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Coins_base"));
        _oper.setSoapAction("http://web.cbr.ru/Coins_base");
        _myOperationsList.add(_oper);
        if (_myOperations.get("coins_base") == null) {
            _myOperations.put("coins_base", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("coins_base")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("coins_baseXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "Coins_baseXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Coins_baseXMLResponse>Coins_baseXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Coins_baseXML"));
        _oper.setSoapAction("http://web.cbr.ru/Coins_baseXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("coins_baseXML") == null) {
            _myOperations.put("coins_baseXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("coins_baseXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("fixingBase", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "FixingBaseResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>FixingBaseResponse>FixingBaseResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "FixingBase"));
        _oper.setSoapAction("http://web.cbr.ru/FixingBase");
        _myOperationsList.add(_oper);
        if (_myOperations.get("fixingBase") == null) {
            _myOperations.put("fixingBase", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("fixingBase")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("fixingBaseXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "FixingBaseXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>FixingBaseXMLResponse>FixingBaseXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "FixingBaseXML"));
        _oper.setSoapAction("http://web.cbr.ru/FixingBaseXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("fixingBaseXML") == null) {
            _myOperations.put("fixingBaseXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("fixingBaseXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("overnight", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "OvernightResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OvernightResponse>OvernightResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Overnight"));
        _oper.setSoapAction("http://web.cbr.ru/Overnight");
        _myOperationsList.add(_oper);
        if (_myOperations.get("overnight") == null) {
            _myOperations.put("overnight", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("overnight")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("overnightXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "OvernightXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OvernightXMLResponse>OvernightXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OvernightXML"));
        _oper.setSoapAction("http://web.cbr.ru/OvernightXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("overnightXML") == null) {
            _myOperations.put("overnightXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("overnightXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("bauction", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "BauctionResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BauctionResponse>BauctionResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Bauction"));
        _oper.setSoapAction("http://web.cbr.ru/Bauction");
        _myOperationsList.add(_oper);
        if (_myOperations.get("bauction") == null) {
            _myOperations.put("bauction", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("bauction")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("bauctionXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "BauctionXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BauctionXMLResponse>BauctionXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BauctionXML"));
        _oper.setSoapAction("http://web.cbr.ru/BauctionXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("bauctionXML") == null) {
            _myOperations.put("bauctionXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("bauctionXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("depoDynamicXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "DepoDynamicXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DepoDynamicXMLResponse>DepoDynamicXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DepoDynamicXML"));
        _oper.setSoapAction("http://web.cbr.ru/DepoDynamicXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("depoDynamicXML") == null) {
            _myOperations.put("depoDynamicXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("depoDynamicXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("depoDynamic", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "DepoDynamicResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DepoDynamicResponse>DepoDynamicResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DepoDynamic"));
        _oper.setSoapAction("http://web.cbr.ru/DepoDynamic");
        _myOperationsList.add(_oper);
        if (_myOperations.get("depoDynamic") == null) {
            _myOperations.put("depoDynamic", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("depoDynamic")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ostatDynamicXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDynamicXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDynamicXMLResponse>OstatDynamicXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDynamicXML"));
        _oper.setSoapAction("http://web.cbr.ru/OstatDynamicXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ostatDynamicXML") == null) {
            _myOperations.put("ostatDynamicXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ostatDynamicXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("ostatDynamic", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDynamicResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDynamicResponse>OstatDynamicResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDynamic"));
        _oper.setSoapAction("http://web.cbr.ru/OstatDynamic");
        _myOperationsList.add(_oper);
        if (_myOperations.get("ostatDynamic") == null) {
            _myOperations.put("ostatDynamic", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("ostatDynamic")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("dragMetDynamicXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "DragMetDynamicXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DragMetDynamicXMLResponse>DragMetDynamicXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DragMetDynamicXML"));
        _oper.setSoapAction("http://web.cbr.ru/DragMetDynamicXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("dragMetDynamicXML") == null) {
            _myOperations.put("dragMetDynamicXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("dragMetDynamicXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("dragMetDynamic", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "DragMetDynamicResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DragMetDynamicResponse>DragMetDynamicResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DragMetDynamic"));
        _oper.setSoapAction("http://web.cbr.ru/DragMetDynamic");
        _myOperationsList.add(_oper);
        if (_myOperations.get("dragMetDynamic") == null) {
            _myOperations.put("dragMetDynamic", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("dragMetDynamic")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getLatestDateTime", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateTimeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateTime"));
        _oper.setSoapAction("http://web.cbr.ru/GetLatestDateTime");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getLatestDateTime") == null) {
            _myOperations.put("getLatestDateTime", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getLatestDateTime")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getLatestDate", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDate"));
        _oper.setSoapAction("http://web.cbr.ru/GetLatestDate");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getLatestDate") == null) {
            _myOperations.put("getLatestDate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getLatestDate")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getLatestDateTimeSeld", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateTimeSeldResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateTimeSeld"));
        _oper.setSoapAction("http://web.cbr.ru/GetLatestDateTimeSeld");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getLatestDateTimeSeld") == null) {
            _myOperations.put("getLatestDateTimeSeld", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getLatestDateTimeSeld")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getLatestDateSeld", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateSeldResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateSeld"));
        _oper.setSoapAction("http://web.cbr.ru/GetLatestDateSeld");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getLatestDateSeld") == null) {
            _myOperations.put("getLatestDateSeld", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getLatestDateSeld")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "Seld"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("enumValutesXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumValutesXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumValutesXMLResponse>EnumValutesXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumValutesXML"));
        _oper.setSoapAction("http://web.cbr.ru/EnumValutesXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("enumValutesXML") == null) {
            _myOperations.put("enumValutesXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("enumValutesXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "Seld"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("enumValutes", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumValutesResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumValutesResponse>EnumValutesResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumValutes"));
        _oper.setSoapAction("http://web.cbr.ru/EnumValutes");
        _myOperationsList.add(_oper);
        if (_myOperations.get("enumValutes") == null) {
            _myOperations.put("enumValutes", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("enumValutes")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "FromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ValutaCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCursDynamicXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursDynamicXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursDynamicXMLResponse>GetCursDynamicXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursDynamicXML"));
        _oper.setSoapAction("http://web.cbr.ru/GetCursDynamicXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCursDynamicXML") == null) {
            _myOperations.put("getCursDynamicXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCursDynamicXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "FromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ToDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "ValutaCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCursDynamic", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursDynamicResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursDynamicResponse>GetCursDynamicResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursDynamic"));
        _oper.setSoapAction("http://web.cbr.ru/GetCursDynamic");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCursDynamic") == null) {
            _myOperations.put("getCursDynamic", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCursDynamic")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCursOnDateXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursOnDateXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursOnDateXMLResponse>GetCursOnDateXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursOnDateXML"));
        _oper.setSoapAction("http://web.cbr.ru/GetCursOnDateXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCursOnDateXML") == null) {
            _myOperations.put("getCursOnDateXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCursOnDateXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSeldCursOnDateXML", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "GetSeldCursOnDateXMLResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetSeldCursOnDateXMLResponse>GetSeldCursOnDateXMLResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetSeldCursOnDateXML"));
        _oper.setSoapAction("http://web.cbr.ru/GetSeldCursOnDateXML");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSeldCursOnDateXML") == null) {
            _myOperations.put("getSeldCursOnDateXML", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSeldCursOnDateXML")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSeldCursOnDate", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "GetSeldCursOnDateResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetSeldCursOnDateResponse>GetSeldCursOnDateResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetSeldCursOnDate"));
        _oper.setSoapAction("http://web.cbr.ru/GetSeldCursOnDate");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSeldCursOnDate") == null) {
            _myOperations.put("getSeldCursOnDate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSeldCursOnDate")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://web.cbr.ru/", "On_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCursOnDate", _params, new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursOnDateResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursOnDateResponse>GetCursOnDateResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursOnDate"));
        _oper.setSoapAction("http://web.cbr.ru/GetCursOnDate");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCursOnDate") == null) {
            _myOperations.put("getCursOnDate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCursOnDate")).add(_oper);
    }

    public DailyInfoSoap12Skeleton() {
        this.impl = new ru.cbr.web.DailyInfoSoap12Impl();
    }

    public DailyInfoSoap12Skeleton(ru.cbr.web.DailyInfoSoap impl) {
        this.impl = impl;
    }
    public ru.cbr.web.SaldoXMLResponseSaldoXMLResult saldoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.SaldoXMLResponseSaldoXMLResult ret = impl.saldoXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.ROISfixXMLResponseROISfixXMLResult ROISfixXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.ROISfixXMLResponseROISfixXMLResult ret = impl.ROISfixXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.RuoniaXMLResponseRuoniaXMLResult ruoniaXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.RuoniaXMLResponseRuoniaXMLResult ret = impl.ruoniaXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.OstatDepoXMLResponseOstatDepoXMLResult ostatDepoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.OstatDepoXMLResponseOstatDepoXMLResult ret = impl.ostatDepoXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.OstatDepoResponseOstatDepoResult ostatDepo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.OstatDepoResponseOstatDepoResult ret = impl.ostatDepo(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.ROISfixResponseROISfixResult ROISfix(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.ROISfixResponseROISfixResult ret = impl.ROISfix(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.RuoniaResponseRuoniaResult ruonia(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.RuoniaResponseRuoniaResult ret = impl.ruonia(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.Mrrf7DResponseMrrf7DResult mrrf7D(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.Mrrf7DResponseMrrf7DResult ret = impl.mrrf7D(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.Mrrf7DXMLResponseMrrf7DXMLResult mrrf7DXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.Mrrf7DXMLResponseMrrf7DXMLResult ret = impl.mrrf7DXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.MrrfResponseMrrfResult mrrf(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.MrrfResponseMrrfResult ret = impl.mrrf(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.MrrfXMLResponseMrrfXMLResult mrrfXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.MrrfXMLResponseMrrfXMLResult ret = impl.mrrfXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.SaldoResponseSaldoResult saldo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.SaldoResponseSaldoResult ret = impl.saldo(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.NewsInfoXMLResponseNewsInfoXMLResult newsInfoXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.NewsInfoXMLResponseNewsInfoXMLResult ret = impl.newsInfoXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.OmodInfoXMLResponseOmodInfoXMLResult omodInfoXML() throws java.rmi.RemoteException
    {
        ru.cbr.web.OmodInfoXMLResponseOmodInfoXMLResult ret = impl.omodInfoXML();
        return ret;
    }

    public ru.cbr.web.XVolResponseXVolResult XVol(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.XVolResponseXVolResult ret = impl.XVol(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.XVolXMLResponseXVolXMLResult XVolXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.XVolXMLResponseXVolXMLResult ret = impl.XVolXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.MainInfoXMLResponseMainInfoXMLResult mainInfoXML() throws java.rmi.RemoteException
    {
        ru.cbr.web.MainInfoXMLResponseMainInfoXMLResult ret = impl.mainInfoXML();
        return ret;
    }

    public ru.cbr.web.AllDataInfoXMLResponseAllDataInfoXMLResult allDataInfoXML() throws java.rmi.RemoteException
    {
        ru.cbr.web.AllDataInfoXMLResponseAllDataInfoXMLResult ret = impl.allDataInfoXML();
        return ret;
    }

    public ru.cbr.web.NewsInfoResponseNewsInfoResult newsInfo(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.NewsInfoResponseNewsInfoResult ret = impl.newsInfo(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.SwapDynamicXMLResponseSwapDynamicXMLResult swapDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.SwapDynamicXMLResponseSwapDynamicXMLResult ret = impl.swapDynamicXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.SwapInfoSellUSDResponseSwapInfoSellUSDResult swapInfoSellUSD(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.SwapInfoSellUSDResponseSwapInfoSellUSDResult ret = impl.swapInfoSellUSD(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult swapInfoSellUSDXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult ret = impl.swapInfoSellUSDXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.SwapDynamicResponseSwapDynamicResult swapDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.SwapDynamicResponseSwapDynamicResult ret = impl.swapDynamic(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.SwapMonthTotalResponseSwapMonthTotalResult swapMonthTotal(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.SwapMonthTotalResponseSwapMonthTotalResult ret = impl.swapMonthTotal(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult swapMonthTotalXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult ret = impl.swapMonthTotalXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.MKRResponseMKRResult MKR(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.MKRResponseMKRResult ret = impl.MKR(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.MKRXMLResponseMKRXMLResult MKRXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.MKRXMLResponseMKRXMLResult ret = impl.MKRXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.DVResponseDVResult DV(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.DVResponseDVResult ret = impl.DV(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.DVXMLResponseDVXMLResult DVXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.DVXMLResponseDVXMLResult ret = impl.DVXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.Repo_debtResponseRepo_debtResult repo_debt(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.Repo_debtResponseRepo_debtResult ret = impl.repo_debt(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.Repo_debtXMLResponseRepo_debtXMLResult repo_debtXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.Repo_debtXMLResponseRepo_debtXMLResult ret = impl.repo_debtXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.Coins_baseResponseCoins_baseResult coins_base(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.Coins_baseResponseCoins_baseResult ret = impl.coins_base(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.Coins_baseXMLResponseCoins_baseXMLResult coins_baseXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.Coins_baseXMLResponseCoins_baseXMLResult ret = impl.coins_baseXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.FixingBaseResponseFixingBaseResult fixingBase(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.FixingBaseResponseFixingBaseResult ret = impl.fixingBase(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.FixingBaseXMLResponseFixingBaseXMLResult fixingBaseXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.FixingBaseXMLResponseFixingBaseXMLResult ret = impl.fixingBaseXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.OvernightResponseOvernightResult overnight(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.OvernightResponseOvernightResult ret = impl.overnight(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.OvernightXMLResponseOvernightXMLResult overnightXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.OvernightXMLResponseOvernightXMLResult ret = impl.overnightXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.BauctionResponseBauctionResult bauction(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.BauctionResponseBauctionResult ret = impl.bauction(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.BauctionXMLResponseBauctionXMLResult bauctionXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.BauctionXMLResponseBauctionXMLResult ret = impl.bauctionXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.DepoDynamicXMLResponseDepoDynamicXMLResult depoDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.DepoDynamicXMLResponseDepoDynamicXMLResult ret = impl.depoDynamicXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.DepoDynamicResponseDepoDynamicResult depoDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.DepoDynamicResponseDepoDynamicResult ret = impl.depoDynamic(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.OstatDynamicXMLResponseOstatDynamicXMLResult ostatDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.OstatDynamicXMLResponseOstatDynamicXMLResult ret = impl.ostatDynamicXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.OstatDynamicResponseOstatDynamicResult ostatDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.OstatDynamicResponseOstatDynamicResult ret = impl.ostatDynamic(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.DragMetDynamicXMLResponseDragMetDynamicXMLResult dragMetDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.DragMetDynamicXMLResponseDragMetDynamicXMLResult ret = impl.dragMetDynamicXML(fromDate, toDate);
        return ret;
    }

    public ru.cbr.web.DragMetDynamicResponseDragMetDynamicResult dragMetDynamic(java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException
    {
        ru.cbr.web.DragMetDynamicResponseDragMetDynamicResult ret = impl.dragMetDynamic(fromDate, toDate);
        return ret;
    }

    public java.util.Calendar getLatestDateTime() throws java.rmi.RemoteException
    {
        java.util.Calendar ret = impl.getLatestDateTime();
        return ret;
    }

    public java.lang.String getLatestDate() throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getLatestDate();
        return ret;
    }

    public java.util.Calendar getLatestDateTimeSeld() throws java.rmi.RemoteException
    {
        java.util.Calendar ret = impl.getLatestDateTimeSeld();
        return ret;
    }

    public java.lang.String getLatestDateSeld() throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getLatestDateSeld();
        return ret;
    }

    public ru.cbr.web.EnumValutesXMLResponseEnumValutesXMLResult enumValutesXML(boolean seld) throws java.rmi.RemoteException
    {
        ru.cbr.web.EnumValutesXMLResponseEnumValutesXMLResult ret = impl.enumValutesXML(seld);
        return ret;
    }

    public ru.cbr.web.EnumValutesResponseEnumValutesResult enumValutes(boolean seld) throws java.rmi.RemoteException
    {
        ru.cbr.web.EnumValutesResponseEnumValutesResult ret = impl.enumValutes(seld);
        return ret;
    }

    public ru.cbr.web.GetCursDynamicXMLResponseGetCursDynamicXMLResult getCursDynamicXML(java.util.Calendar fromDate, java.util.Calendar toDate, java.lang.String valutaCode) throws java.rmi.RemoteException
    {
        ru.cbr.web.GetCursDynamicXMLResponseGetCursDynamicXMLResult ret = impl.getCursDynamicXML(fromDate, toDate, valutaCode);
        return ret;
    }

    public ru.cbr.web.GetCursDynamicResponseGetCursDynamicResult getCursDynamic(java.util.Calendar fromDate, java.util.Calendar toDate, java.lang.String valutaCode) throws java.rmi.RemoteException
    {
        ru.cbr.web.GetCursDynamicResponseGetCursDynamicResult ret = impl.getCursDynamic(fromDate, toDate, valutaCode);
        return ret;
    }

    public ru.cbr.web.GetCursOnDateXMLResponseGetCursOnDateXMLResult getCursOnDateXML(java.util.Calendar on_date) throws java.rmi.RemoteException
    {
        ru.cbr.web.GetCursOnDateXMLResponseGetCursOnDateXMLResult ret = impl.getCursOnDateXML(on_date);
        return ret;
    }

    public ru.cbr.web.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult getSeldCursOnDateXML(java.util.Calendar on_date) throws java.rmi.RemoteException
    {
        ru.cbr.web.GetSeldCursOnDateXMLResponseGetSeldCursOnDateXMLResult ret = impl.getSeldCursOnDateXML(on_date);
        return ret;
    }

    public ru.cbr.web.GetSeldCursOnDateResponseGetSeldCursOnDateResult getSeldCursOnDate(java.util.Calendar on_date) throws java.rmi.RemoteException
    {
        ru.cbr.web.GetSeldCursOnDateResponseGetSeldCursOnDateResult ret = impl.getSeldCursOnDate(on_date);
        return ret;
    }

    public ru.cbr.web.GetCursOnDateResponseGetCursOnDateResult getCursOnDate(java.util.Calendar on_date) throws java.rmi.RemoteException
    {
        ru.cbr.web.GetCursOnDateResponseGetCursOnDateResult ret = impl.getCursOnDate(on_date);
        return ret;
    }

}
