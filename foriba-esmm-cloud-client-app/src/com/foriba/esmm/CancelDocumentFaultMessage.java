
package com.foriba.esmm;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ProcessingFault", targetNamespace = "http://foriba.com/eSmm/")
public class CancelDocumentFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ProcessingFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public CancelDocumentFaultMessage(String message, ProcessingFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CancelDocumentFaultMessage(String message, ProcessingFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.foriba.esmm.ProcessingFault
     */
    public ProcessingFault getFaultInfo() {
        return faultInfo;
    }

}
