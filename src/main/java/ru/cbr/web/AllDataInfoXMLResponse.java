/**
 * AllDataInfoXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class AllDataInfoXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.AllDataInfoXMLResponseAllDataInfoXMLResult allDataInfoXMLResult;

    public AllDataInfoXMLResponse() {
    }

    public AllDataInfoXMLResponse(
           ru.cbr.web.AllDataInfoXMLResponseAllDataInfoXMLResult allDataInfoXMLResult) {
           this.allDataInfoXMLResult = allDataInfoXMLResult;
    }


    /**
     * Gets the allDataInfoXMLResult value for this AllDataInfoXMLResponse.
     * 
     * @return allDataInfoXMLResult
     */
    public ru.cbr.web.AllDataInfoXMLResponseAllDataInfoXMLResult getAllDataInfoXMLResult() {
        return allDataInfoXMLResult;
    }


    /**
     * Sets the allDataInfoXMLResult value for this AllDataInfoXMLResponse.
     * 
     * @param allDataInfoXMLResult
     */
    public void setAllDataInfoXMLResult(ru.cbr.web.AllDataInfoXMLResponseAllDataInfoXMLResult allDataInfoXMLResult) {
        this.allDataInfoXMLResult = allDataInfoXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllDataInfoXMLResponse)) return false;
        AllDataInfoXMLResponse other = (AllDataInfoXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allDataInfoXMLResult==null && other.getAllDataInfoXMLResult()==null) || 
             (this.allDataInfoXMLResult!=null &&
              this.allDataInfoXMLResult.equals(other.getAllDataInfoXMLResult())));
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
        if (getAllDataInfoXMLResult() != null) {
            _hashCode += getAllDataInfoXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AllDataInfoXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">AllDataInfoXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allDataInfoXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "AllDataInfoXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>AllDataInfoXMLResponse>AllDataInfoXMLResult"));
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
