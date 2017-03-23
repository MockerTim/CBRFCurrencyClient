/**
 * OstatDepoXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class OstatDepoXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.OstatDepoXMLResponseOstatDepoXMLResult ostatDepoXMLResult;

    public OstatDepoXMLResponse() {
    }

    public OstatDepoXMLResponse(
           ru.cbr.web.OstatDepoXMLResponseOstatDepoXMLResult ostatDepoXMLResult) {
           this.ostatDepoXMLResult = ostatDepoXMLResult;
    }


    /**
     * Gets the ostatDepoXMLResult value for this OstatDepoXMLResponse.
     * 
     * @return ostatDepoXMLResult
     */
    public ru.cbr.web.OstatDepoXMLResponseOstatDepoXMLResult getOstatDepoXMLResult() {
        return ostatDepoXMLResult;
    }


    /**
     * Sets the ostatDepoXMLResult value for this OstatDepoXMLResponse.
     * 
     * @param ostatDepoXMLResult
     */
    public void setOstatDepoXMLResult(ru.cbr.web.OstatDepoXMLResponseOstatDepoXMLResult ostatDepoXMLResult) {
        this.ostatDepoXMLResult = ostatDepoXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OstatDepoXMLResponse)) return false;
        OstatDepoXMLResponse other = (OstatDepoXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ostatDepoXMLResult==null && other.getOstatDepoXMLResult()==null) || 
             (this.ostatDepoXMLResult!=null &&
              this.ostatDepoXMLResult.equals(other.getOstatDepoXMLResult())));
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
        if (getOstatDepoXMLResult() != null) {
            _hashCode += getOstatDepoXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OstatDepoXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDepoXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ostatDepoXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDepoXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDepoXMLResponse>OstatDepoXMLResult"));
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
