/**
 * FixingBaseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class FixingBaseResponse  implements java.io.Serializable {
    private ru.cbr.web.FixingBaseResponseFixingBaseResult fixingBaseResult;

    public FixingBaseResponse() {
    }

    public FixingBaseResponse(
           ru.cbr.web.FixingBaseResponseFixingBaseResult fixingBaseResult) {
           this.fixingBaseResult = fixingBaseResult;
    }


    /**
     * Gets the fixingBaseResult value for this FixingBaseResponse.
     * 
     * @return fixingBaseResult
     */
    public ru.cbr.web.FixingBaseResponseFixingBaseResult getFixingBaseResult() {
        return fixingBaseResult;
    }


    /**
     * Sets the fixingBaseResult value for this FixingBaseResponse.
     * 
     * @param fixingBaseResult
     */
    public void setFixingBaseResult(ru.cbr.web.FixingBaseResponseFixingBaseResult fixingBaseResult) {
        this.fixingBaseResult = fixingBaseResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FixingBaseResponse)) return false;
        FixingBaseResponse other = (FixingBaseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fixingBaseResult==null && other.getFixingBaseResult()==null) || 
             (this.fixingBaseResult!=null &&
              this.fixingBaseResult.equals(other.getFixingBaseResult())));
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
        if (getFixingBaseResult() != null) {
            _hashCode += getFixingBaseResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FixingBaseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">FixingBaseResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixingBaseResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "FixingBaseResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>FixingBaseResponse>FixingBaseResult"));
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
