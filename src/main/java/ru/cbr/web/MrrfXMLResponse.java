/**
 * MrrfXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class MrrfXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.MrrfXMLResponseMrrfXMLResult mrrfXMLResult;

    public MrrfXMLResponse() {
    }

    public MrrfXMLResponse(
           ru.cbr.web.MrrfXMLResponseMrrfXMLResult mrrfXMLResult) {
           this.mrrfXMLResult = mrrfXMLResult;
    }


    /**
     * Gets the mrrfXMLResult value for this MrrfXMLResponse.
     * 
     * @return mrrfXMLResult
     */
    public ru.cbr.web.MrrfXMLResponseMrrfXMLResult getMrrfXMLResult() {
        return mrrfXMLResult;
    }


    /**
     * Sets the mrrfXMLResult value for this MrrfXMLResponse.
     * 
     * @param mrrfXMLResult
     */
    public void setMrrfXMLResult(ru.cbr.web.MrrfXMLResponseMrrfXMLResult mrrfXMLResult) {
        this.mrrfXMLResult = mrrfXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MrrfXMLResponse)) return false;
        MrrfXMLResponse other = (MrrfXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mrrfXMLResult==null && other.getMrrfXMLResult()==null) || 
             (this.mrrfXMLResult!=null &&
              this.mrrfXMLResult.equals(other.getMrrfXMLResult())));
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
        if (getMrrfXMLResult() != null) {
            _hashCode += getMrrfXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MrrfXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrfXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mrrfXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrfXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrfXMLResponse>mrrfXMLResult"));
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
