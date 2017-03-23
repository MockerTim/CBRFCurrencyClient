/**
 * DailyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public interface DailyInfo extends javax.xml.rpc.Service {

/**
 * Веб сервис для получения ежедневных данных ver 18.09.2014
 */
    public java.lang.String getDailyInfoSoap12Address();

    public ru.cbr.web.DailyInfoSoap getDailyInfoSoap12() throws javax.xml.rpc.ServiceException;

    public ru.cbr.web.DailyInfoSoap getDailyInfoSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getDailyInfoSoapAddress();

    public ru.cbr.web.DailyInfoSoap getDailyInfoSoap() throws javax.xml.rpc.ServiceException;

    public ru.cbr.web.DailyInfoSoap getDailyInfoSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
