/**
 * GetLatestDateTimeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class GetLatestDateTimeResponse  implements java.io.Serializable {
    private java.util.Calendar getLatestDateTimeResult;

    public GetLatestDateTimeResponse() {
    }

    public GetLatestDateTimeResponse(
           java.util.Calendar getLatestDateTimeResult) {
           this.getLatestDateTimeResult = getLatestDateTimeResult;
    }


    /**
     * Gets the getLatestDateTimeResult value for this GetLatestDateTimeResponse.
     * 
     * @return getLatestDateTimeResult
     */
    public java.util.Calendar getGetLatestDateTimeResult() {
        return getLatestDateTimeResult;
    }


    /**
     * Sets the getLatestDateTimeResult value for this GetLatestDateTimeResponse.
     * 
     * @param getLatestDateTimeResult
     */
    public void setGetLatestDateTimeResult(java.util.Calendar getLatestDateTimeResult) {
        this.getLatestDateTimeResult = getLatestDateTimeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLatestDateTimeResponse)) return false;
        GetLatestDateTimeResponse other = (GetLatestDateTimeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLatestDateTimeResult==null && other.getGetLatestDateTimeResult()==null) || 
             (this.getLatestDateTimeResult!=null &&
              this.getLatestDateTimeResult.equals(other.getGetLatestDateTimeResult())));
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
        if (getGetLatestDateTimeResult() != null) {
            _hashCode += getGetLatestDateTimeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLatestDateTimeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateTimeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLatestDateTimeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateTimeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
