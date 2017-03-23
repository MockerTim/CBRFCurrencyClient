/**
 * GetCursOnDateXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class GetCursOnDateXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.GetCursOnDateXMLResponseGetCursOnDateXMLResult getCursOnDateXMLResult;

    public GetCursOnDateXMLResponse() {
    }

    public GetCursOnDateXMLResponse(
           ru.cbr.web.GetCursOnDateXMLResponseGetCursOnDateXMLResult getCursOnDateXMLResult) {
           this.getCursOnDateXMLResult = getCursOnDateXMLResult;
    }


    /**
     * Gets the getCursOnDateXMLResult value for this GetCursOnDateXMLResponse.
     * 
     * @return getCursOnDateXMLResult
     */
    public ru.cbr.web.GetCursOnDateXMLResponseGetCursOnDateXMLResult getGetCursOnDateXMLResult() {
        return getCursOnDateXMLResult;
    }


    /**
     * Sets the getCursOnDateXMLResult value for this GetCursOnDateXMLResponse.
     * 
     * @param getCursOnDateXMLResult
     */
    public void setGetCursOnDateXMLResult(ru.cbr.web.GetCursOnDateXMLResponseGetCursOnDateXMLResult getCursOnDateXMLResult) {
        this.getCursOnDateXMLResult = getCursOnDateXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCursOnDateXMLResponse)) return false;
        GetCursOnDateXMLResponse other = (GetCursOnDateXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCursOnDateXMLResult==null && other.getGetCursOnDateXMLResult()==null) || 
             (this.getCursOnDateXMLResult!=null &&
              this.getCursOnDateXMLResult.equals(other.getGetCursOnDateXMLResult())));
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
        if (getGetCursOnDateXMLResult() != null) {
            _hashCode += getGetCursOnDateXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCursOnDateXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">GetCursOnDateXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCursOnDateXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "GetCursOnDateXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>GetCursOnDateXMLResponse>GetCursOnDateXMLResult"));
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
