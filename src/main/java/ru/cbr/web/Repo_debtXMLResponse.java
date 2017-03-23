/**
 * Repo_debtXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class Repo_debtXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.Repo_debtXMLResponseRepo_debtXMLResult repo_debtXMLResult;

    public Repo_debtXMLResponse() {
    }

    public Repo_debtXMLResponse(
           ru.cbr.web.Repo_debtXMLResponseRepo_debtXMLResult repo_debtXMLResult) {
           this.repo_debtXMLResult = repo_debtXMLResult;
    }


    /**
     * Gets the repo_debtXMLResult value for this Repo_debtXMLResponse.
     * 
     * @return repo_debtXMLResult
     */
    public ru.cbr.web.Repo_debtXMLResponseRepo_debtXMLResult getRepo_debtXMLResult() {
        return repo_debtXMLResult;
    }


    /**
     * Sets the repo_debtXMLResult value for this Repo_debtXMLResponse.
     * 
     * @param repo_debtXMLResult
     */
    public void setRepo_debtXMLResult(ru.cbr.web.Repo_debtXMLResponseRepo_debtXMLResult repo_debtXMLResult) {
        this.repo_debtXMLResult = repo_debtXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Repo_debtXMLResponse)) return false;
        Repo_debtXMLResponse other = (Repo_debtXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.repo_debtXMLResult==null && other.getRepo_debtXMLResult()==null) || 
             (this.repo_debtXMLResult!=null &&
              this.repo_debtXMLResult.equals(other.getRepo_debtXMLResult())));
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
        if (getRepo_debtXMLResult() != null) {
            _hashCode += getRepo_debtXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Repo_debtXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">Repo_debtXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repo_debtXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Repo_debtXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Repo_debtXMLResponse>Repo_debtXMLResult"));
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
