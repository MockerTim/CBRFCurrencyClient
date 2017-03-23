/**
 * SwapDynamicXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class SwapDynamicXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.SwapDynamicXMLResponseSwapDynamicXMLResult swapDynamicXMLResult;

    public SwapDynamicXMLResponse() {
    }

    public SwapDynamicXMLResponse(
           ru.cbr.web.SwapDynamicXMLResponseSwapDynamicXMLResult swapDynamicXMLResult) {
           this.swapDynamicXMLResult = swapDynamicXMLResult;
    }


    /**
     * Gets the swapDynamicXMLResult value for this SwapDynamicXMLResponse.
     * 
     * @return swapDynamicXMLResult
     */
    public ru.cbr.web.SwapDynamicXMLResponseSwapDynamicXMLResult getSwapDynamicXMLResult() {
        return swapDynamicXMLResult;
    }


    /**
     * Sets the swapDynamicXMLResult value for this SwapDynamicXMLResponse.
     * 
     * @param swapDynamicXMLResult
     */
    public void setSwapDynamicXMLResult(ru.cbr.web.SwapDynamicXMLResponseSwapDynamicXMLResult swapDynamicXMLResult) {
        this.swapDynamicXMLResult = swapDynamicXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwapDynamicXMLResponse)) return false;
        SwapDynamicXMLResponse other = (SwapDynamicXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.swapDynamicXMLResult==null && other.getSwapDynamicXMLResult()==null) || 
             (this.swapDynamicXMLResult!=null &&
              this.swapDynamicXMLResult.equals(other.getSwapDynamicXMLResult())));
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
        if (getSwapDynamicXMLResult() != null) {
            _hashCode += getSwapDynamicXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwapDynamicXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDynamicXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swapDynamicXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDynamicXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDynamicXMLResponse>SwapDynamicXMLResult"));
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
