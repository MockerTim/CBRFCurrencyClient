/**
 * SwapMonthTotalXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class SwapMonthTotalXMLResponse  implements java.io.Serializable {
    private ru.cbr.web.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult swapMonthTotalXMLResult;

    public SwapMonthTotalXMLResponse() {
    }

    public SwapMonthTotalXMLResponse(
           ru.cbr.web.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult swapMonthTotalXMLResult) {
           this.swapMonthTotalXMLResult = swapMonthTotalXMLResult;
    }


    /**
     * Gets the swapMonthTotalXMLResult value for this SwapMonthTotalXMLResponse.
     * 
     * @return swapMonthTotalXMLResult
     */
    public ru.cbr.web.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult getSwapMonthTotalXMLResult() {
        return swapMonthTotalXMLResult;
    }


    /**
     * Sets the swapMonthTotalXMLResult value for this SwapMonthTotalXMLResponse.
     * 
     * @param swapMonthTotalXMLResult
     */
    public void setSwapMonthTotalXMLResult(ru.cbr.web.SwapMonthTotalXMLResponseSwapMonthTotalXMLResult swapMonthTotalXMLResult) {
        this.swapMonthTotalXMLResult = swapMonthTotalXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwapMonthTotalXMLResponse)) return false;
        SwapMonthTotalXMLResponse other = (SwapMonthTotalXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.swapMonthTotalXMLResult==null && other.getSwapMonthTotalXMLResult()==null) || 
             (this.swapMonthTotalXMLResult!=null &&
              this.swapMonthTotalXMLResult.equals(other.getSwapMonthTotalXMLResult())));
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
        if (getSwapMonthTotalXMLResult() != null) {
            _hashCode += getSwapMonthTotalXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwapMonthTotalXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapMonthTotalXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swapMonthTotalXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapMonthTotalXMLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapMonthTotalXMLResponse>SwapMonthTotalXMLResult"));
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
