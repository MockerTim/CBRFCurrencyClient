/**
 * OvernightXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class OvernightXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.OvernightXMLResponseOvernightXMLResult overnightXMLResult;

    public OvernightXMLResponse() {
    }

    public OvernightXMLResponse(
           ru.cbr.web.OvernightXMLResponseOvernightXMLResult overnightXMLResult) {
           this.overnightXMLResult = overnightXMLResult;
    }


    /**
     * Gets the overnightXMLResult value for this OvernightXMLResponse.
     * 
     * @return overnightXMLResult
     */
    public ru.cbr.web.OvernightXMLResponseOvernightXMLResult getOvernightXMLResult() {
        return overnightXMLResult;
    }


    /**
     * Sets the overnightXMLResult value for this OvernightXMLResponse.
     * 
     * @param overnightXMLResult
     */
    public void setOvernightXMLResult(ru.cbr.web.OvernightXMLResponseOvernightXMLResult overnightXMLResult) {
        this.overnightXMLResult = overnightXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvernightXMLResponse)) return false;
        OvernightXMLResponse other = (OvernightXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.overnightXMLResult==null && other.getOvernightXMLResult()==null) || 
             (this.overnightXMLResult!=null &&
              this.overnightXMLResult.equals(other.getOvernightXMLResult())));
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
        if (getOvernightXMLResult() != null) {
            _hashCode += getOvernightXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvernightXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">OvernightXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overnightXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OvernightXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OvernightXMLResponse>OvernightXMLResult"));
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
