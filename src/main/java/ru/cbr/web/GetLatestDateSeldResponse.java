/**
 * GetLatestDateSeldResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class GetLatestDateSeldResponse  implements java.io.Serializable {
    private java.lang.String getLatestDateSeldResult;

    public GetLatestDateSeldResponse() {
    }

    public GetLatestDateSeldResponse(
           java.lang.String getLatestDateSeldResult) {
           this.getLatestDateSeldResult = getLatestDateSeldResult;
    }


    /**
     * Gets the getLatestDateSeldResult value for this GetLatestDateSeldResponse.
     * 
     * @return getLatestDateSeldResult
     */
    public java.lang.String getGetLatestDateSeldResult() {
        return getLatestDateSeldResult;
    }


    /**
     * Sets the getLatestDateSeldResult value for this GetLatestDateSeldResponse.
     * 
     * @param getLatestDateSeldResult
     */
    public void setGetLatestDateSeldResult(java.lang.String getLatestDateSeldResult) {
        this.getLatestDateSeldResult = getLatestDateSeldResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLatestDateSeldResponse)) return false;
        GetLatestDateSeldResponse other = (GetLatestDateSeldResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLatestDateSeldResult==null && other.getGetLatestDateSeldResult()==null) || 
             (this.getLatestDateSeldResult!=null &&
              this.getLatestDateSeldResult.equals(other.getGetLatestDateSeldResult())));
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
        if (getGetLatestDateSeldResult() != null) {
            _hashCode += getGetLatestDateSeldResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLatestDateSeldResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateSeldResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLatestDateSeldResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateSeldResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
