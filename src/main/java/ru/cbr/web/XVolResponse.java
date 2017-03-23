/**
 * XVolResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class XVolResponse  implements java.io.Serializable {
    private ru.cbr.web.XVolResponseXVolResult XVolResult;

    public XVolResponse() {
    }

    public XVolResponse(
           ru.cbr.web.XVolResponseXVolResult XVolResult) {
           this.XVolResult = XVolResult;
    }


    /**
     * Gets the XVolResult value for this XVolResponse.
     * 
     * @return XVolResult
     */
    public ru.cbr.web.XVolResponseXVolResult getXVolResult() {
        return XVolResult;
    }


    /**
     * Sets the XVolResult value for this XVolResponse.
     * 
     * @param XVolResult
     */
    public void setXVolResult(ru.cbr.web.XVolResponseXVolResult XVolResult) {
        this.XVolResult = XVolResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XVolResponse)) return false;
        XVolResponse other = (XVolResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.XVolResult==null && other.getXVolResult()==null) || 
             (this.XVolResult!=null &&
              this.XVolResult.equals(other.getXVolResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getXVolResult() != null) {
            _hashCode += getXVolResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XVolResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">XVolResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XVolResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "XVolResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>XVolResponse>XVolResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
