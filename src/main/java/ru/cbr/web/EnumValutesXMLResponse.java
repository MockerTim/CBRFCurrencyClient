/**
 * EnumValutesXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class EnumValutesXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.EnumValutesXMLResponseEnumValutesXMLResult enumValutesXMLResult;

    public EnumValutesXMLResponse() {
    }

    public EnumValutesXMLResponse(
           ru.cbr.web.EnumValutesXMLResponseEnumValutesXMLResult enumValutesXMLResult) {
           this.enumValutesXMLResult = enumValutesXMLResult;
    }


    /**
     * Gets the enumValutesXMLResult value for this EnumValutesXMLResponse.
     * 
     * @return enumValutesXMLResult
     */
    public ru.cbr.web.EnumValutesXMLResponseEnumValutesXMLResult getEnumValutesXMLResult() {
        return enumValutesXMLResult;
    }


    /**
     * Sets the enumValutesXMLResult value for this EnumValutesXMLResponse.
     * 
     * @param enumValutesXMLResult
     */
    public void setEnumValutesXMLResult(ru.cbr.web.EnumValutesXMLResponseEnumValutesXMLResult enumValutesXMLResult) {
        this.enumValutesXMLResult = enumValutesXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnumValutesXMLResponse)) return false;
        EnumValutesXMLResponse other = (EnumValutesXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enumValutesXMLResult==null && other.getEnumValutesXMLResult()==null) || 
             (this.enumValutesXMLResult!=null &&
              this.enumValutesXMLResult.equals(other.getEnumValutesXMLResult())));
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
        if (getEnumValutesXMLResult() != null) {
            _hashCode += getEnumValutesXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumValutesXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">EnumValutesXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumValutesXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "EnumValutesXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>EnumValutesXMLResponse>EnumValutesXMLResult"));
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
