/**
 * NewsInfoXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class NewsInfoXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.NewsInfoXMLResponseNewsInfoXMLResult newsInfoXMLResult;

    public NewsInfoXMLResponse() {
    }

    public NewsInfoXMLResponse(
           ru.cbr.web.NewsInfoXMLResponseNewsInfoXMLResult newsInfoXMLResult) {
           this.newsInfoXMLResult = newsInfoXMLResult;
    }


    /**
     * Gets the newsInfoXMLResult value for this NewsInfoXMLResponse.
     * 
     * @return newsInfoXMLResult
     */
    public ru.cbr.web.NewsInfoXMLResponseNewsInfoXMLResult getNewsInfoXMLResult() {
        return newsInfoXMLResult;
    }


    /**
     * Sets the newsInfoXMLResult value for this NewsInfoXMLResponse.
     * 
     * @param newsInfoXMLResult
     */
    public void setNewsInfoXMLResult(ru.cbr.web.NewsInfoXMLResponseNewsInfoXMLResult newsInfoXMLResult) {
        this.newsInfoXMLResult = newsInfoXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewsInfoXMLResponse)) return false;
        NewsInfoXMLResponse other = (NewsInfoXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.newsInfoXMLResult==null && other.getNewsInfoXMLResult()==null) || 
             (this.newsInfoXMLResult!=null &&
              this.newsInfoXMLResult.equals(other.getNewsInfoXMLResult())));
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
        if (getNewsInfoXMLResult() != null) {
            _hashCode += getNewsInfoXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewsInfoXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">NewsInfoXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newsInfoXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "NewsInfoXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>NewsInfoXMLResponse>NewsInfoXMLResult"));
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
