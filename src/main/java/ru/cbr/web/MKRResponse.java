/**
 * MKRResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class MKRResponse  implements java.io.Serializable {
    private ru.cbr.web.MKRResponseMKRResult MKRResult;

    public MKRResponse() {
    }

    public MKRResponse(
           ru.cbr.web.MKRResponseMKRResult MKRResult) {
           this.MKRResult = MKRResult;
    }


    /**
     * Gets the MKRResult value for this MKRResponse.
     * 
     * @return MKRResult
     */
    public ru.cbr.web.MKRResponseMKRResult getMKRResult() {
        return MKRResult;
    }


    /**
     * Sets the MKRResult value for this MKRResponse.
     * 
     * @param MKRResult
     */
    public void setMKRResult(ru.cbr.web.MKRResponseMKRResult MKRResult) {
        this.MKRResult = MKRResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MKRResponse)) return false;
        MKRResponse other = (MKRResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MKRResult==null && other.getMKRResult()==null) || 
             (this.MKRResult!=null &&
              this.MKRResult.equals(other.getMKRResult())));
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
        if (getMKRResult() != null) {
            _hashCode += getMKRResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MKRResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">MKRResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MKRResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MKRResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MKRResponse>MKRResult"));
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
