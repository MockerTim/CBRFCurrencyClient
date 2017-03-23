/**
 * SaldoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class SaldoResponse  implements java.io.Serializable {
    private ru.cbr.web.SaldoResponseSaldoResult saldoResult;

    public SaldoResponse() {
    }

    public SaldoResponse(
           ru.cbr.web.SaldoResponseSaldoResult saldoResult) {
           this.saldoResult = saldoResult;
    }


    /**
     * Gets the saldoResult value for this SaldoResponse.
     * 
     * @return saldoResult
     */
    public ru.cbr.web.SaldoResponseSaldoResult getSaldoResult() {
        return saldoResult;
    }


    /**
     * Sets the saldoResult value for this SaldoResponse.
     * 
     * @param saldoResult
     */
    public void setSaldoResult(ru.cbr.web.SaldoResponseSaldoResult saldoResult) {
        this.saldoResult = saldoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaldoResponse)) return false;
        SaldoResponse other = (SaldoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.saldoResult==null && other.getSaldoResult()==null) || 
             (this.saldoResult!=null &&
              this.saldoResult.equals(other.getSaldoResult())));
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
        if (getSaldoResult() != null) {
            _hashCode += getSaldoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaldoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">SaldoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SaldoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SaldoResponse>SaldoResult"));
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
