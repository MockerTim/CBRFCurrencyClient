/**
 * Coins_baseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class Coins_baseResponse  implements java.io.Serializable {
    private ru.cbr.web.Coins_baseResponseCoins_baseResult coins_baseResult;

    public Coins_baseResponse() {
    }

    public Coins_baseResponse(
           ru.cbr.web.Coins_baseResponseCoins_baseResult coins_baseResult) {
           this.coins_baseResult = coins_baseResult;
    }


    /**
     * Gets the coins_baseResult value for this Coins_baseResponse.
     * 
     * @return coins_baseResult
     */
    public ru.cbr.web.Coins_baseResponseCoins_baseResult getCoins_baseResult() {
        return coins_baseResult;
    }


    /**
     * Sets the coins_baseResult value for this Coins_baseResponse.
     * 
     * @param coins_baseResult
     */
    public void setCoins_baseResult(ru.cbr.web.Coins_baseResponseCoins_baseResult coins_baseResult) {
        this.coins_baseResult = coins_baseResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Coins_baseResponse)) return false;
        Coins_baseResponse other = (Coins_baseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coins_baseResult==null && other.getCoins_baseResult()==null) || 
             (this.coins_baseResult!=null &&
              this.coins_baseResult.equals(other.getCoins_baseResult())));
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
        if (getCoins_baseResult() != null) {
            _hashCode += getCoins_baseResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Coins_baseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">Coins_baseResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coins_baseResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Coins_baseResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Coins_baseResponse>Coins_baseResult"));
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
