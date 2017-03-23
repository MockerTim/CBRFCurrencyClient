/**
 * Repo_debtResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class Repo_debtResponse  implements java.io.Serializable {
    private ru.cbr.web.Repo_debtResponseRepo_debtResult repo_debtResult;

    public Repo_debtResponse() {
    }

    public Repo_debtResponse(
           ru.cbr.web.Repo_debtResponseRepo_debtResult repo_debtResult) {
           this.repo_debtResult = repo_debtResult;
    }


    /**
     * Gets the repo_debtResult value for this Repo_debtResponse.
     * 
     * @return repo_debtResult
     */
    public ru.cbr.web.Repo_debtResponseRepo_debtResult getRepo_debtResult() {
        return repo_debtResult;
    }


    /**
     * Sets the repo_debtResult value for this Repo_debtResponse.
     * 
     * @param repo_debtResult
     */
    public void setRepo_debtResult(ru.cbr.web.Repo_debtResponseRepo_debtResult repo_debtResult) {
        this.repo_debtResult = repo_debtResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Repo_debtResponse)) return false;
        Repo_debtResponse other = (Repo_debtResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.repo_debtResult==null && other.getRepo_debtResult()==null) || 
             (this.repo_debtResult!=null &&
              this.repo_debtResult.equals(other.getRepo_debtResult())));
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
        if (getRepo_debtResult() != null) {
            _hashCode += getRepo_debtResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Repo_debtResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">Repo_debtResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repo_debtResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "Repo_debtResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>Repo_debtResponse>Repo_debtResult"));
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
