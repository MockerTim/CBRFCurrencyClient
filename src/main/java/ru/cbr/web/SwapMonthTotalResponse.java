/**
 * SwapMonthTotalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.cbr.web;

public class SwapMonthTotalResponse  implements java.io.Serializable {
    private ru.cbr.web.SwapMonthTotalResponseSwapMonthTotalResult swapMonthTotalResult;

    public SwapMonthTotalResponse() {
    }

    public SwapMonthTotalResponse(
           ru.cbr.web.SwapMonthTotalResponseSwapMonthTotalResult swapMonthTotalResult) {
           this.swapMonthTotalResult = swapMonthTotalResult;
    }


    /**
     * Gets the swapMonthTotalResult value for this SwapMonthTotalResponse.
     * 
     * @return swapMonthTotalResult
     */
    public ru.cbr.web.SwapMonthTotalResponseSwapMonthTotalResult getSwapMonthTotalResult() {
        return swapMonthTotalResult;
    }


    /**
     * Sets the swapMonthTotalResult value for this SwapMonthTotalResponse.
     * 
     * @param swapMonthTotalResult
     */
    public void setSwapMonthTotalResult(ru.cbr.web.SwapMonthTotalResponseSwapMonthTotalResult swapMonthTotalResult) {
        this.swapMonthTotalResult = swapMonthTotalResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwapMonthTotalResponse)) return false;
        SwapMonthTotalResponse other = (SwapMonthTotalResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.swapMonthTotalResult==null && other.getSwapMonthTotalResult()==null) || 
             (this.swapMonthTotalResult!=null &&
              this.swapMonthTotalResult.equals(other.getSwapMonthTotalResult())));
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
        if (getSwapMonthTotalResult() != null) {
            _hashCode += getSwapMonthTotalResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwapMonthTotalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">SwapMonthTotalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swapMonthTotalResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.cbr.ru/", "SwapMonthTotalResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://web.cbr.ru/", ">>SwapMonthTotalResponse>SwapMonthTotalResult"));
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
