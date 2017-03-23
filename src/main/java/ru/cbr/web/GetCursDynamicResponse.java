/**
 * GetCursDynamicResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class GetCursDynamicResponse  implements java.io.Serializable {
    private ru.cbr.web.GetCursDynamicResponseGetCursDynamicResult getCursDynamicResult;

    public GetCursDynamicResponse() {
    }

    public GetCursDynamicResponse(
           ru.cbr.web.GetCursDynamicResponseGetCursDynamicResult getCursDynamicResult) {
           this.getCursDynamicResult = getCursDynamicResult;
    }


    /**
     * Gets the getCursDynamicResult value for this GetCursDynamicResponse.
     * 
     * @return getCursDynamicResult
     */
    public ru.cbr.web.GetCursDynamicResponseGetCursDynamicResult getGetCursDynamicResult() {
        return getCursDynamicResult;
    }


    /**
     * Sets the getCursDynamicResult value for this GetCursDynamicResponse.
     * 
     * @param getCursDynamicResult
     */
    public void setGetCursDynamicResult(ru.cbr.web.GetCursDynamicResponseGetCursDynamicResult getCursDynamicResult) {
        this.getCursDynamicResult = getCursDynamicResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCursDynamicResponse)) return false;
        GetCursDynamicResponse other = (GetCursDynamicResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCursDynamicResult==null && other.getGetCursDynamicResult()==null) || 
             (this.getCursDynamicResult!=null &&
              this.getCursDynamicResult.equals(other.getGetCursDynamicResult())));
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
        if (getGetCursDynamicResult() != null) {
            _hashCode += getGetCursDynamicResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCursDynamicResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursDynamicResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCursDynamicResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursDynamicResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursDynamicResponse>GetCursDynamicResult"));
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
