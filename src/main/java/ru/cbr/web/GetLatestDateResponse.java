/**
 * GetLatestDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class GetLatestDateResponse  implements java.io.Serializable {
    private java.lang.String getLatestDateResult;

    public GetLatestDateResponse() {
    }

    public GetLatestDateResponse(
           java.lang.String getLatestDateResult) {
           this.getLatestDateResult = getLatestDateResult;
    }


    /**
     * Gets the getLatestDateResult value for this GetLatestDateResponse.
     * 
     * @return getLatestDateResult
     */
    public java.lang.String getGetLatestDateResult() {
        return getLatestDateResult;
    }


    /**
     * Sets the getLatestDateResult value for this GetLatestDateResponse.
     * 
     * @param getLatestDateResult
     */
    public void setGetLatestDateResult(java.lang.String getLatestDateResult) {
        this.getLatestDateResult = getLatestDateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLatestDateResponse)) return false;
        GetLatestDateResponse other = (GetLatestDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLatestDateResult==null && other.getGetLatestDateResult()==null) || 
             (this.getLatestDateResult!=null &&
              this.getLatestDateResult.equals(other.getGetLatestDateResult())));
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
        if (getGetLatestDateResult() != null) {
            _hashCode += getGetLatestDateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLatestDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetLatestDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLatestDateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetLatestDateResult"));
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
