/**
 * EnumValutesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class EnumValutesResponse  implements java.io.Serializable {
    private ru.cbr.web.EnumValutesResponseEnumValutesResult enumValutesResult;

    public EnumValutesResponse() {
    }

    public EnumValutesResponse(
           ru.cbr.web.EnumValutesResponseEnumValutesResult enumValutesResult) {
           this.enumValutesResult = enumValutesResult;
    }


    /**
     * Gets the enumValutesResult value for this EnumValutesResponse.
     * 
     * @return enumValutesResult
     */
    public ru.cbr.web.EnumValutesResponseEnumValutesResult getEnumValutesResult() {
        return enumValutesResult;
    }


    /**
     * Sets the enumValutesResult value for this EnumValutesResponse.
     * 
     * @param enumValutesResult
     */
    public void setEnumValutesResult(ru.cbr.web.EnumValutesResponseEnumValutesResult enumValutesResult) {
        this.enumValutesResult = enumValutesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnumValutesResponse)) return false;
        EnumValutesResponse other = (EnumValutesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enumValutesResult==null && other.getEnumValutesResult()==null) || 
             (this.enumValutesResult!=null &&
              this.enumValutesResult.equals(other.getEnumValutesResult())));
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
        if (getEnumValutesResult() != null) {
            _hashCode += getEnumValutesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumValutesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">EnumValutesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumValutesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumValutesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumValutesResponse>EnumValutesResult"));
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
