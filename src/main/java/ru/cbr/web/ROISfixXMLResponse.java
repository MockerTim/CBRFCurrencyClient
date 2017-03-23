/**
 * ROISfixXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class ROISfixXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.ROISfixXMLResponseROISfixXMLResult ROISfixXMLResult;

    public ROISfixXMLResponse() {
    }

    public ROISfixXMLResponse(
           ru.cbr.web.ROISfixXMLResponseROISfixXMLResult ROISfixXMLResult) {
           this.ROISfixXMLResult = ROISfixXMLResult;
    }


    /**
     * Gets the ROISfixXMLResult value for this ROISfixXMLResponse.
     * 
     * @return ROISfixXMLResult
     */
    public ru.cbr.web.ROISfixXMLResponseROISfixXMLResult getROISfixXMLResult() {
        return ROISfixXMLResult;
    }


    /**
     * Sets the ROISfixXMLResult value for this ROISfixXMLResponse.
     * 
     * @param ROISfixXMLResult
     */
    public void setROISfixXMLResult(ru.cbr.web.ROISfixXMLResponseROISfixXMLResult ROISfixXMLResult) {
        this.ROISfixXMLResult = ROISfixXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ROISfixXMLResponse)) return false;
        ROISfixXMLResponse other = (ROISfixXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ROISfixXMLResult==null && other.getROISfixXMLResult()==null) || 
             (this.ROISfixXMLResult!=null &&
              this.ROISfixXMLResult.equals(other.getROISfixXMLResult())));
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
        if (getROISfixXMLResult() != null) {
            _hashCode += getROISfixXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ROISfixXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">ROISfixXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROISfixXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ROISfixXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ROISfixXMLResponse>ROISfixXMLResult"));
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
