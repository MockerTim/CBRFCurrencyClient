/**
 * FixingBaseXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class FixingBaseXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.FixingBaseXMLResponseFixingBaseXMLResult fixingBaseXMLResult;

    public FixingBaseXMLResponse() {
    }

    public FixingBaseXMLResponse(
           ru.cbr.web.FixingBaseXMLResponseFixingBaseXMLResult fixingBaseXMLResult) {
           this.fixingBaseXMLResult = fixingBaseXMLResult;
    }


    /**
     * Gets the fixingBaseXMLResult value for this FixingBaseXMLResponse.
     * 
     * @return fixingBaseXMLResult
     */
    public ru.cbr.web.FixingBaseXMLResponseFixingBaseXMLResult getFixingBaseXMLResult() {
        return fixingBaseXMLResult;
    }


    /**
     * Sets the fixingBaseXMLResult value for this FixingBaseXMLResponse.
     * 
     * @param fixingBaseXMLResult
     */
    public void setFixingBaseXMLResult(ru.cbr.web.FixingBaseXMLResponseFixingBaseXMLResult fixingBaseXMLResult) {
        this.fixingBaseXMLResult = fixingBaseXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FixingBaseXMLResponse)) return false;
        FixingBaseXMLResponse other = (FixingBaseXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fixingBaseXMLResult==null && other.getFixingBaseXMLResult()==null) || 
             (this.fixingBaseXMLResult!=null &&
              this.fixingBaseXMLResult.equals(other.getFixingBaseXMLResult())));
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
        if (getFixingBaseXMLResult() != null) {
            _hashCode += getFixingBaseXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FixingBaseXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">FixingBaseXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixingBaseXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "FixingBaseXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>FixingBaseXMLResponse>FixingBaseXMLResult"));
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
