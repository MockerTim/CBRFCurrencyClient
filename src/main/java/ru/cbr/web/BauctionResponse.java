/**
 * BauctionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class BauctionResponse  implements java.io.Serializable {
    private ru.cbr.web.BauctionResponseBauctionResult bauctionResult;

    public BauctionResponse() {
    }

    public BauctionResponse(
           ru.cbr.web.BauctionResponseBauctionResult bauctionResult) {
           this.bauctionResult = bauctionResult;
    }


    /**
     * Gets the bauctionResult value for this BauctionResponse.
     * 
     * @return bauctionResult
     */
    public ru.cbr.web.BauctionResponseBauctionResult getBauctionResult() {
        return bauctionResult;
    }


    /**
     * Sets the bauctionResult value for this BauctionResponse.
     * 
     * @param bauctionResult
     */
    public void setBauctionResult(ru.cbr.web.BauctionResponseBauctionResult bauctionResult) {
        this.bauctionResult = bauctionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BauctionResponse)) return false;
        BauctionResponse other = (BauctionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bauctionResult==null && other.getBauctionResult()==null) || 
             (this.bauctionResult!=null &&
              this.bauctionResult.equals(other.getBauctionResult())));
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
        if (getBauctionResult() != null) {
            _hashCode += getBauctionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BauctionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">BauctionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bauctionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "BauctionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>BauctionResponse>BauctionResult"));
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
