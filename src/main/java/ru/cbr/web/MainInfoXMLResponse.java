/**
 * MainInfoXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class MainInfoXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.MainInfoXMLResponseMainInfoXMLResult mainInfoXMLResult;

    public MainInfoXMLResponse() {
    }

    public MainInfoXMLResponse(
           ru.cbr.web.MainInfoXMLResponseMainInfoXMLResult mainInfoXMLResult) {
           this.mainInfoXMLResult = mainInfoXMLResult;
    }


    /**
     * Gets the mainInfoXMLResult value for this MainInfoXMLResponse.
     * 
     * @return mainInfoXMLResult
     */
    public ru.cbr.web.MainInfoXMLResponseMainInfoXMLResult getMainInfoXMLResult() {
        return mainInfoXMLResult;
    }


    /**
     * Sets the mainInfoXMLResult value for this MainInfoXMLResponse.
     * 
     * @param mainInfoXMLResult
     */
    public void setMainInfoXMLResult(ru.cbr.web.MainInfoXMLResponseMainInfoXMLResult mainInfoXMLResult) {
        this.mainInfoXMLResult = mainInfoXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MainInfoXMLResponse)) return false;
        MainInfoXMLResponse other = (MainInfoXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mainInfoXMLResult==null && other.getMainInfoXMLResult()==null) || 
             (this.mainInfoXMLResult!=null &&
              this.mainInfoXMLResult.equals(other.getMainInfoXMLResult())));
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
        if (getMainInfoXMLResult() != null) {
            _hashCode += getMainInfoXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MainInfoXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">MainInfoXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainInfoXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MainInfoXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MainInfoXMLResponse>MainInfoXMLResult"));
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
