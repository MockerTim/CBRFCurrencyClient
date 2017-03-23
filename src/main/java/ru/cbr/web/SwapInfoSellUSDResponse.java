/**
 * SwapInfoSellUSDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class SwapInfoSellUSDResponse  implements java.io.Serializable {
    private ru.cbr.web.SwapInfoSellUSDResponseSwapInfoSellUSDResult swapInfoSellUSDResult;

    public SwapInfoSellUSDResponse() {
    }

    public SwapInfoSellUSDResponse(
           ru.cbr.web.SwapInfoSellUSDResponseSwapInfoSellUSDResult swapInfoSellUSDResult) {
           this.swapInfoSellUSDResult = swapInfoSellUSDResult;
    }


    /**
     * Gets the swapInfoSellUSDResult value for this SwapInfoSellUSDResponse.
     * 
     * @return swapInfoSellUSDResult
     */
    public ru.cbr.web.SwapInfoSellUSDResponseSwapInfoSellUSDResult getSwapInfoSellUSDResult() {
        return swapInfoSellUSDResult;
    }


    /**
     * Sets the swapInfoSellUSDResult value for this SwapInfoSellUSDResponse.
     * 
     * @param swapInfoSellUSDResult
     */
    public void setSwapInfoSellUSDResult(ru.cbr.web.SwapInfoSellUSDResponseSwapInfoSellUSDResult swapInfoSellUSDResult) {
        this.swapInfoSellUSDResult = swapInfoSellUSDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwapInfoSellUSDResponse)) return false;
        SwapInfoSellUSDResponse other = (SwapInfoSellUSDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.swapInfoSellUSDResult==null && other.getSwapInfoSellUSDResult()==null) || 
             (this.swapInfoSellUSDResult!=null &&
              this.swapInfoSellUSDResult.equals(other.getSwapInfoSellUSDResult())));
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
        if (getSwapInfoSellUSDResult() != null) {
            _hashCode += getSwapInfoSellUSDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwapInfoSellUSDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swapInfoSellUSDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDResponse>SwapInfoSellUSDResult"));
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
