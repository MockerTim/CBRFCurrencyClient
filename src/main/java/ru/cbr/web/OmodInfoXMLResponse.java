/**
 * OmodInfoXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class OmodInfoXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.OmodInfoXMLResponseOmodInfoXMLResult omodInfoXMLResult;

    public OmodInfoXMLResponse() {
    }

    public OmodInfoXMLResponse(
           ru.cbr.web.OmodInfoXMLResponseOmodInfoXMLResult omodInfoXMLResult) {
           this.omodInfoXMLResult = omodInfoXMLResult;
    }


    /**
     * Gets the omodInfoXMLResult value for this OmodInfoXMLResponse.
     * 
     * @return omodInfoXMLResult
     */
    public ru.cbr.web.OmodInfoXMLResponseOmodInfoXMLResult getOmodInfoXMLResult() {
        return omodInfoXMLResult;
    }


    /**
     * Sets the omodInfoXMLResult value for this OmodInfoXMLResponse.
     * 
     * @param omodInfoXMLResult
     */
    public void setOmodInfoXMLResult(ru.cbr.web.OmodInfoXMLResponseOmodInfoXMLResult omodInfoXMLResult) {
        this.omodInfoXMLResult = omodInfoXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OmodInfoXMLResponse)) return false;
        OmodInfoXMLResponse other = (OmodInfoXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.omodInfoXMLResult==null && other.getOmodInfoXMLResult()==null) || 
             (this.omodInfoXMLResult!=null &&
              this.omodInfoXMLResult.equals(other.getOmodInfoXMLResult())));
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
        if (getOmodInfoXMLResult() != null) {
            _hashCode += getOmodInfoXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OmodInfoXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">OmodInfoXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("omodInfoXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "OmodInfoXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>OmodInfoXMLResponse>OmodInfoXMLResult"));
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
