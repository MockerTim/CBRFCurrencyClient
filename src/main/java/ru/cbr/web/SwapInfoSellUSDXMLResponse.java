/**
 * SwapInfoSellUSDXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class SwapInfoSellUSDXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult swapInfoSellUSDXMLResult;

    public SwapInfoSellUSDXMLResponse() {
    }

    public SwapInfoSellUSDXMLResponse(
           ru.cbr.web.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult swapInfoSellUSDXMLResult) {
           this.swapInfoSellUSDXMLResult = swapInfoSellUSDXMLResult;
    }


    /**
     * Gets the swapInfoSellUSDXMLResult value for this SwapInfoSellUSDXMLResponse.
     * 
     * @return swapInfoSellUSDXMLResult
     */
    public ru.cbr.web.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult getSwapInfoSellUSDXMLResult() {
        return swapInfoSellUSDXMLResult;
    }


    /**
     * Sets the swapInfoSellUSDXMLResult value for this SwapInfoSellUSDXMLResponse.
     * 
     * @param swapInfoSellUSDXMLResult
     */
    public void setSwapInfoSellUSDXMLResult(ru.cbr.web.SwapInfoSellUSDXMLResponseSwapInfoSellUSDXMLResult swapInfoSellUSDXMLResult) {
        this.swapInfoSellUSDXMLResult = swapInfoSellUSDXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwapInfoSellUSDXMLResponse)) return false;
        SwapInfoSellUSDXMLResponse other = (SwapInfoSellUSDXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.swapInfoSellUSDXMLResult==null && other.getSwapInfoSellUSDXMLResult()==null) || 
             (this.swapInfoSellUSDXMLResult!=null &&
              this.swapInfoSellUSDXMLResult.equals(other.getSwapInfoSellUSDXMLResult())));
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
        if (getSwapInfoSellUSDXMLResult() != null) {
            _hashCode += getSwapInfoSellUSDXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwapInfoSellUSDXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapInfoSellUSDXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swapInfoSellUSDXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapInfoSellUSDXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapInfoSellUSDXMLResponse>SwapInfoSellUSDXMLResult"));
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
