/**
 * DailyInfoLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class DailyInfoLocator extends org.apache.axis.client.Service implements ru.cbr.web.DailyInfo {

/**
 * Веб сервис для получения ежедневных данных ver 18.09.2014
 */

    public DailyInfoLocator() {
    }


    public DailyInfoLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DailyInfoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DailyInfoSoap12
    private java.lang.String DailyInfoSoap12_address = "http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx";

    public java.lang.String getDailyInfoSoap12Address() {
        return DailyInfoSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DailyInfoSoap12WSDDServiceName = "DailyInfoSoap12";

    public java.lang.String getDailyInfoSoap12WSDDServiceName() {
        return DailyInfoSoap12WSDDServiceName;
    }

    public void setDailyInfoSoap12WSDDServiceName(java.lang.String name) {
        DailyInfoSoap12WSDDServiceName = name;
    }

    public ru.cbr.web.DailyInfoSoap getDailyInfoSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DailyInfoSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDailyInfoSoap12(endpoint);
    }

    public ru.cbr.web.DailyInfoSoap getDailyInfoSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ru.cbr.web.DailyInfoSoap12Stub _stub = new ru.cbr.web.DailyInfoSoap12Stub(portAddress, this);
            _stub.setPortName(getDailyInfoSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDailyInfoSoap12EndpointAddress(java.lang.String address) {
        DailyInfoSoap12_address = address;
    }


    // Use to get a proxy class for DailyInfoSoap
    private java.lang.String DailyInfoSoap_address = "http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx";

    public java.lang.String getDailyInfoSoapAddress() {
        return DailyInfoSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DailyInfoSoapWSDDServiceName = "DailyInfoSoap";

    public java.lang.String getDailyInfoSoapWSDDServiceName() {
        return DailyInfoSoapWSDDServiceName;
    }

    public void setDailyInfoSoapWSDDServiceName(java.lang.String name) {
        DailyInfoSoapWSDDServiceName = name;
    }

    public ru.cbr.web.DailyInfoSoap getDailyInfoSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DailyInfoSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDailyInfoSoap(endpoint);
    }

    public ru.cbr.web.DailyInfoSoap getDailyInfoSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ru.cbr.web.DailyInfoSoapStub _stub = new ru.cbr.web.DailyInfoSoapStub(portAddress, this);
            _stub.setPortName(getDailyInfoSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDailyInfoSoapEndpointAddress(java.lang.String address) {
        DailyInfoSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ru.cbr.web.DailyInfoSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ru.cbr.web.DailyInfoSoap12Stub _stub = new ru.cbr.web.DailyInfoSoap12Stub(new java.net.URL(DailyInfoSoap12_address), this);
                _stub.setPortName(getDailyInfoSoap12WSDDServiceName());
                return _stub;
            }
            if (ru.cbr.web.DailyInfoSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ru.cbr.web.DailyInfoSoapStub _stub = new ru.cbr.web.DailyInfoSoapStub(new java.net.URL(DailyInfoSoap_address), this);
                _stub.setPortName(getDailyInfoSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DailyInfoSoap12".equals(inputPortName)) {
            return getDailyInfoSoap12();
        }
        else if ("DailyInfoSoap".equals(inputPortName)) {
            return getDailyInfoSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://web.cbr.ru/", "DailyInfo");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://web.cbr.ru/", "DailyInfoSoap12"));
            ports.add(new javax.xml.namespace.QName("http://web.cbr.ru/", "DailyInfoSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DailyInfoSoap12".equals(portName)) {
            setDailyInfoSoap12EndpointAddress(address);
        }
        else 
if ("DailyInfoSoap".equals(portName)) {
            setDailyInfoSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
