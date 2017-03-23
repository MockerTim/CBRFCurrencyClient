/**
 * Mrrf7DResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class Mrrf7DResponse  implements java.io.Serializable {
    private ru.cbr.web.Mrrf7DResponseMrrf7DResult mrrf7DResult;

    public Mrrf7DResponse() {
    }

    public Mrrf7DResponse(
           ru.cbr.web.Mrrf7DResponseMrrf7DResult mrrf7DResult) {
           this.mrrf7DResult = mrrf7DResult;
    }


    /**
     * Gets the mrrf7DResult value for this Mrrf7DResponse.
     * 
     * @return mrrf7DResult
     */
    public ru.cbr.web.Mrrf7DResponseMrrf7DResult getMrrf7DResult() {
        return mrrf7DResult;
    }


    /**
     * Sets the mrrf7DResult value for this Mrrf7DResponse.
     * 
     * @param mrrf7DResult
     */
    public void setMrrf7DResult(ru.cbr.web.Mrrf7DResponseMrrf7DResult mrrf7DResult) {
        this.mrrf7DResult = mrrf7DResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Mrrf7DResponse)) return false;
        Mrrf7DResponse other = (Mrrf7DResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mrrf7DResult==null && other.getMrrf7DResult()==null) || 
             (this.mrrf7DResult!=null &&
              this.mrrf7DResult.equals(other.getMrrf7DResult())));
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
        if (getMrrf7DResult() != null) {
            _hashCode += getMrrf7DResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Mrrf7DResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">mrrf7DResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mrrf7DResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "mrrf7DResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>mrrf7DResponse>mrrf7DResult"));
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
