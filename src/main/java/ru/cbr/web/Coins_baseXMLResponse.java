/**
 * Coins_baseXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class Coins_baseXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.Coins_baseXMLResponseCoins_baseXMLResult coins_baseXMLResult;

    public Coins_baseXMLResponse() {
    }

    public Coins_baseXMLResponse(
           ru.cbr.web.Coins_baseXMLResponseCoins_baseXMLResult coins_baseXMLResult) {
           this.coins_baseXMLResult = coins_baseXMLResult;
    }


    /**
     * Gets the coins_baseXMLResult value for this Coins_baseXMLResponse.
     * 
     * @return coins_baseXMLResult
     */
    public ru.cbr.web.Coins_baseXMLResponseCoins_baseXMLResult getCoins_baseXMLResult() {
        return coins_baseXMLResult;
    }


    /**
     * Sets the coins_baseXMLResult value for this Coins_baseXMLResponse.
     * 
     * @param coins_baseXMLResult
     */
    public void setCoins_baseXMLResult(ru.cbr.web.Coins_baseXMLResponseCoins_baseXMLResult coins_baseXMLResult) {
        this.coins_baseXMLResult = coins_baseXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Coins_baseXMLResponse)) return false;
        Coins_baseXMLResponse other = (Coins_baseXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coins_baseXMLResult==null && other.getCoins_baseXMLResult()==null) || 
             (this.coins_baseXMLResult!=null &&
              this.coins_baseXMLResult.equals(other.getCoins_baseXMLResult())));
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
        if (getCoins_baseXMLResult() != null) {
            _hashCode += getCoins_baseXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Coins_baseXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">Coins_baseXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coins_baseXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Coins_baseXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Coins_baseXMLResponse>Coins_baseXMLResult"));
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
