/**
 * OstatDynamicXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class OstatDynamicXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.OstatDynamicXMLResponseOstatDynamicXMLResult ostatDynamicXMLResult;

    public OstatDynamicXMLResponse() {
    }

    public OstatDynamicXMLResponse(
           ru.cbr.web.OstatDynamicXMLResponseOstatDynamicXMLResult ostatDynamicXMLResult) {
           this.ostatDynamicXMLResult = ostatDynamicXMLResult;
    }


    /**
     * Gets the ostatDynamicXMLResult value for this OstatDynamicXMLResponse.
     * 
     * @return ostatDynamicXMLResult
     */
    public ru.cbr.web.OstatDynamicXMLResponseOstatDynamicXMLResult getOstatDynamicXMLResult() {
        return ostatDynamicXMLResult;
    }


    /**
     * Sets the ostatDynamicXMLResult value for this OstatDynamicXMLResponse.
     * 
     * @param ostatDynamicXMLResult
     */
    public void setOstatDynamicXMLResult(ru.cbr.web.OstatDynamicXMLResponseOstatDynamicXMLResult ostatDynamicXMLResult) {
        this.ostatDynamicXMLResult = ostatDynamicXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OstatDynamicXMLResponse)) return false;
        OstatDynamicXMLResponse other = (OstatDynamicXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ostatDynamicXMLResult==null && other.getOstatDynamicXMLResult()==null) || 
             (this.ostatDynamicXMLResult!=null &&
              this.ostatDynamicXMLResult.equals(other.getOstatDynamicXMLResult())));
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
        if (getOstatDynamicXMLResult() != null) {
            _hashCode += getOstatDynamicXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OstatDynamicXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">OstatDynamicXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ostatDynamicXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OstatDynamicXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OstatDynamicXMLResponse>OstatDynamicXMLResult"));
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
