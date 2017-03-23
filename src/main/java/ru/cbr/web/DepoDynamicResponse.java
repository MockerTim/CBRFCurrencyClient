/**
 * DepoDynamicResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class DepoDynamicResponse  implements java.io.Serializable {
    private ru.cbr.web.DepoDynamicResponseDepoDynamicResult depoDynamicResult;

    public DepoDynamicResponse() {
    }

    public DepoDynamicResponse(
           ru.cbr.web.DepoDynamicResponseDepoDynamicResult depoDynamicResult) {
           this.depoDynamicResult = depoDynamicResult;
    }


    /**
     * Gets the depoDynamicResult value for this DepoDynamicResponse.
     * 
     * @return depoDynamicResult
     */
    public ru.cbr.web.DepoDynamicResponseDepoDynamicResult getDepoDynamicResult() {
        return depoDynamicResult;
    }


    /**
     * Sets the depoDynamicResult value for this DepoDynamicResponse.
     * 
     * @param depoDynamicResult
     */
    public void setDepoDynamicResult(ru.cbr.web.DepoDynamicResponseDepoDynamicResult depoDynamicResult) {
        this.depoDynamicResult = depoDynamicResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepoDynamicResponse)) return false;
        DepoDynamicResponse other = (DepoDynamicResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.depoDynamicResult==null && other.getDepoDynamicResult()==null) || 
             (this.depoDynamicResult!=null &&
              this.depoDynamicResult.equals(other.getDepoDynamicResult())));
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
        if (getDepoDynamicResult() != null) {
            _hashCode += getDepoDynamicResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepoDynamicResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">DepoDynamicResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depoDynamicResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "DepoDynamicResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>DepoDynamicResponse>DepoDynamicResult"));
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
