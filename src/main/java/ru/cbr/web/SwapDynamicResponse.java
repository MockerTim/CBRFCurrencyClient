/**
 * SwapDynamicResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class SwapDynamicResponse  implements java.io.Serializable {
    private ru.cbr.web.SwapDynamicResponseSwapDynamicResult swapDynamicResult;

    public SwapDynamicResponse() {
    }

    public SwapDynamicResponse(
           ru.cbr.web.SwapDynamicResponseSwapDynamicResult swapDynamicResult) {
           this.swapDynamicResult = swapDynamicResult;
    }


    /**
     * Gets the swapDynamicResult value for this SwapDynamicResponse.
     * 
     * @return swapDynamicResult
     */
    public ru.cbr.web.SwapDynamicResponseSwapDynamicResult getSwapDynamicResult() {
        return swapDynamicResult;
    }


    /**
     * Sets the swapDynamicResult value for this SwapDynamicResponse.
     * 
     * @param swapDynamicResult
     */
    public void setSwapDynamicResult(ru.cbr.web.SwapDynamicResponseSwapDynamicResult swapDynamicResult) {
        this.swapDynamicResult = swapDynamicResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwapDynamicResponse)) return false;
        SwapDynamicResponse other = (SwapDynamicResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.swapDynamicResult==null && other.getSwapDynamicResult()==null) || 
             (this.swapDynamicResult!=null &&
              this.swapDynamicResult.equals(other.getSwapDynamicResult())));
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
        if (getSwapDynamicResult() != null) {
            _hashCode += getSwapDynamicResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwapDynamicResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapDynamicResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swapDynamicResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapDynamicResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapDynamicResponse>SwapDynamicResult"));
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
