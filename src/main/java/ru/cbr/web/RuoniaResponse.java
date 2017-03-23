/**
 * RuoniaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class RuoniaResponse  implements java.io.Serializable {
    private ru.cbr.web.RuoniaResponseRuoniaResult ruoniaResult;

    public RuoniaResponse() {
    }

    public RuoniaResponse(
           ru.cbr.web.RuoniaResponseRuoniaResult ruoniaResult) {
           this.ruoniaResult = ruoniaResult;
    }


    /**
     * Gets the ruoniaResult value for this RuoniaResponse.
     * 
     * @return ruoniaResult
     */
    public ru.cbr.web.RuoniaResponseRuoniaResult getRuoniaResult() {
        return ruoniaResult;
    }


    /**
     * Sets the ruoniaResult value for this RuoniaResponse.
     * 
     * @param ruoniaResult
     */
    public void setRuoniaResult(ru.cbr.web.RuoniaResponseRuoniaResult ruoniaResult) {
        this.ruoniaResult = ruoniaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RuoniaResponse)) return false;
        RuoniaResponse other = (RuoniaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ruoniaResult==null && other.getRuoniaResult()==null) || 
             (this.ruoniaResult!=null &&
              this.ruoniaResult.equals(other.getRuoniaResult())));
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
        if (getRuoniaResult() != null) {
            _hashCode += getRuoniaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RuoniaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">RuoniaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruoniaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "RuoniaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>RuoniaResponse>RuoniaResult"));
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
