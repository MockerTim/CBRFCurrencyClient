/**
 * XVolXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class XVolXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.XVolXMLResponseXVolXMLResult XVolXMLResult;

    public XVolXMLResponse() {
    }

    public XVolXMLResponse(
           ru.cbr.web.XVolXMLResponseXVolXMLResult XVolXMLResult) {
           this.XVolXMLResult = XVolXMLResult;
    }


    /**
     * Gets the XVolXMLResult value for this XVolXMLResponse.
     * 
     * @return XVolXMLResult
     */
    public ru.cbr.web.XVolXMLResponseXVolXMLResult getXVolXMLResult() {
        return XVolXMLResult;
    }


    /**
     * Sets the XVolXMLResult value for this XVolXMLResponse.
     * 
     * @param XVolXMLResult
     */
    public void setXVolXMLResult(ru.cbr.web.XVolXMLResponseXVolXMLResult XVolXMLResult) {
        this.XVolXMLResult = XVolXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XVolXMLResponse)) return false;
        XVolXMLResponse other = (XVolXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.XVolXMLResult==null && other.getXVolXMLResult()==null) || 
             (this.XVolXMLResult!=null &&
              this.XVolXMLResult.equals(other.getXVolXMLResult())));
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
        if (getXVolXMLResult() != null) {
            _hashCode += getXVolXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XVolXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">XVolXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XVolXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "XVolXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>XVolXMLResponse>XVolXMLResult"));
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
