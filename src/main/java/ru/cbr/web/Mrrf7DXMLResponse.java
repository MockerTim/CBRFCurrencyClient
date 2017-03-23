/**
 * Mrrf7DXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class Mrrf7DXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.Mrrf7DXMLResponseMrrf7DXMLResult mrrf7DXMLResult;

    public Mrrf7DXMLResponse() {
    }

    public Mrrf7DXMLResponse(
           ru.cbr.web.Mrrf7DXMLResponseMrrf7DXMLResult mrrf7DXMLResult) {
           this.mrrf7DXMLResult = mrrf7DXMLResult;
    }


    /**
     * Gets the mrrf7DXMLResult value for this Mrrf7DXMLResponse.
     * 
     * @return mrrf7DXMLResult
     */
    public ru.cbr.web.Mrrf7DXMLResponseMrrf7DXMLResult getMrrf7DXMLResult() {
        return mrrf7DXMLResult;
    }


    /**
     * Sets the mrrf7DXMLResult value for this Mrrf7DXMLResponse.
     * 
     * @param mrrf7DXMLResult
     */
    public void setMrrf7DXMLResult(ru.cbr.web.Mrrf7DXMLResponseMrrf7DXMLResult mrrf7DXMLResult) {
        this.mrrf7DXMLResult = mrrf7DXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mrrf7DXMLResponse)) return false;
        Mrrf7DXMLResponse other = (Mrrf7DXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mrrf7DXMLResult==null && other.getMrrf7DXMLResult()==null) || 
             (this.mrrf7DXMLResult!=null &&
              this.mrrf7DXMLResult.equals(other.getMrrf7DXMLResult())));
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
        if (getMrrf7DXMLResult() != null) {
            _hashCode += getMrrf7DXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Mrrf7DXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrf7DXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mrrf7DXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf7DXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrf7DXMLResponse>mrrf7DXMLResult"));
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
