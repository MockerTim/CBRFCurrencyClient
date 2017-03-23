/**
 * ROISfixResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class ROISfixResponse  implements java.io.Serializable {
    private ru.cbr.web.ROISfixResponseROISfixResult ROISfixResult;

    public ROISfixResponse() {
    }

    public ROISfixResponse(
           ru.cbr.web.ROISfixResponseROISfixResult ROISfixResult) {
           this.ROISfixResult = ROISfixResult;
    }


    /**
     * Gets the ROISfixResult value for this ROISfixResponse.
     * 
     * @return ROISfixResult
     */
    public ru.cbr.web.ROISfixResponseROISfixResult getROISfixResult() {
        return ROISfixResult;
    }


    /**
     * Sets the ROISfixResult value for this ROISfixResponse.
     * 
     * @param ROISfixResult
     */
    public void setROISfixResult(ru.cbr.web.ROISfixResponseROISfixResult ROISfixResult) {
        this.ROISfixResult = ROISfixResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ROISfixResponse)) return false;
        ROISfixResponse other = (ROISfixResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ROISfixResult==null && other.getROISfixResult()==null) || 
             (this.ROISfixResult!=null &&
              this.ROISfixResult.equals(other.getROISfixResult())));
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
        if (getROISfixResult() != null) {
            _hashCode += getROISfixResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ROISfixResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">ROISfixResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROISfixResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "ROISfixResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>ROISfixResponse>ROISfixResult"));
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
