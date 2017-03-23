/**
 * MrrfResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class MrrfResponse  implements java.io.Serializable {
    private ru.cbr.web.MrrfResponseMrrfResult mrrfResult;

    public MrrfResponse() {
    }

    public MrrfResponse(
           ru.cbr.web.MrrfResponseMrrfResult mrrfResult) {
           this.mrrfResult = mrrfResult;
    }


    /**
     * Gets the mrrfResult value for this MrrfResponse.
     * 
     * @return mrrfResult
     */
    public ru.cbr.web.MrrfResponseMrrfResult getMrrfResult() {
        return mrrfResult;
    }


    /**
     * Sets the mrrfResult value for this MrrfResponse.
     * 
     * @param mrrfResult
     */
    public void setMrrfResult(ru.cbr.web.MrrfResponseMrrfResult mrrfResult) {
        this.mrrfResult = mrrfResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MrrfResponse)) return false;
        MrrfResponse other = (MrrfResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mrrfResult==null && other.getMrrfResult()==null) || 
             (this.mrrfResult!=null &&
              this.mrrfResult.equals(other.getMrrfResult())));
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
        if (getMrrfResult() != null) {
            _hashCode += getMrrfResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MrrfResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrfResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mrrfResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrfResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrfResponse>mrrfResult"));
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
