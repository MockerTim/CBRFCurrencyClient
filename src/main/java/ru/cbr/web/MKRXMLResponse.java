/**
 * MKRXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class MKRXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.MKRXMLResponseMKRXMLResult MKRXMLResult;

    public MKRXMLResponse() {
    }

    public MKRXMLResponse(
           ru.cbr.web.MKRXMLResponseMKRXMLResult MKRXMLResult) {
           this.MKRXMLResult = MKRXMLResult;
    }


    /**
     * Gets the MKRXMLResult value for this MKRXMLResponse.
     * 
     * @return MKRXMLResult
     */
    public ru.cbr.web.MKRXMLResponseMKRXMLResult getMKRXMLResult() {
        return MKRXMLResult;
    }


    /**
     * Sets the MKRXMLResult value for this MKRXMLResponse.
     * 
     * @param MKRXMLResult
     */
    public void setMKRXMLResult(ru.cbr.web.MKRXMLResponseMKRXMLResult MKRXMLResult) {
        this.MKRXMLResult = MKRXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MKRXMLResponse)) return false;
        MKRXMLResponse other = (MKRXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MKRXMLResult==null && other.getMKRXMLResult()==null) || 
             (this.MKRXMLResult!=null &&
              this.MKRXMLResult.equals(other.getMKRXMLResult())));
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
        if (getMKRXMLResult() != null) {
            _hashCode += getMKRXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MKRXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">MKRXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MKRXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "MKRXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>MKRXMLResponse>MKRXMLResult"));
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
