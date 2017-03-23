/**
 * OstatDynamicResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class OstatDynamicResponse  implements java.io.Serializable {
    private ru.cbr.web.OstatDynamicResponseOstatDynamicResult ostatDynamicResult;

    public OstatDynamicResponse() {
    }

    public OstatDynamicResponse(
           ru.cbr.web.OstatDynamicResponseOstatDynamicResult ostatDynamicResult) {
           this.ostatDynamicResult = ostatDynamicResult;
    }


    /**
     * Gets the ostatDynamicResult value for this OstatDynamicResponse.
     * 
     * @return ostatDynamicResult
     */
    public ru.cbr.web.OstatDynamicResponseOstatDynamicResult getOstatDynamicResult() {
        return ostatDynamicResult;
    }


    /**
     * Sets the ostatDynamicResult value for this OstatDynamicResponse.
     * 
     * @param ostatDynamicResult
     */
    public void setOstatDynamicResult(ru.cbr.web.OstatDynamicResponseOstatDynamicResult ostatDynamicResult) {
        this.ostatDynamicResult = ostatDynamicResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OstatDynamicResponse)) return false;
        OstatDynamicResponse other = (OstatDynamicResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ostatDynamicResult==null && other.getOstatDynamicResult()==null) || 
             (this.ostatDynamicResult!=null &&
              this.ostatDynamicResult.equals(other.getOstatDynamicResult())));
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
        if (getOstatDynamicResult() != null) {
            _hashCode += getOstatDynamicResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OstatDynamicResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDynamicResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ostatDynamicResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDynamicResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDynamicResponse>OstatDynamicResult"));
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
