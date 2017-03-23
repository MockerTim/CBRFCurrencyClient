/**
 * GetLatestDateTimeSeldResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class GetLatestDateTimeSeldResponse  implements java.io.Serializable {
    private java.util.Calendar getLatestDateTimeSeldResult;

    public GetLatestDateTimeSeldResponse() {
    }

    public GetLatestDateTimeSeldResponse(
           java.util.Calendar getLatestDateTimeSeldResult) {
           this.getLatestDateTimeSeldResult = getLatestDateTimeSeldResult;
    }


    /**
     * Gets the getLatestDateTimeSeldResult value for this GetLatestDateTimeSeldResponse.
     * 
     * @return getLatestDateTimeSeldResult
     */
    public java.util.Calendar getGetLatestDateTimeSeldResult() {
        return getLatestDateTimeSeldResult;
    }


    /**
     * Sets the getLatestDateTimeSeldResult value for this GetLatestDateTimeSeldResponse.
     * 
     * @param getLatestDateTimeSeldResult
     */
    public void setGetLatestDateTimeSeldResult(java.util.Calendar getLatestDateTimeSeldResult) {
        this.getLatestDateTimeSeldResult = getLatestDateTimeSeldResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLatestDateTimeSeldResponse)) return false;
        GetLatestDateTimeSeldResponse other = (GetLatestDateTimeSeldResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLatestDateTimeSeldResult==null && other.getGetLatestDateTimeSeldResult()==null) || 
             (this.getLatestDateTimeSeldResult!=null &&
              this.getLatestDateTimeSeldResult.equals(other.getGetLatestDateTimeSeldResult())));
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
        if (getGetLatestDateTimeSeldResult() != null) {
            _hashCode += getGetLatestDateTimeSeldResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLatestDateTimeSeldResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateTimeSeldResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLatestDateTimeSeldResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateTimeSeldResult"));
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
