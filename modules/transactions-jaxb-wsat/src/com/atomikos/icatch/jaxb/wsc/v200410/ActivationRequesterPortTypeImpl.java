
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.atomikos.icatch.jaxb.wsc.v200410;

import java.util.logging.Logger;

/**
 * This class was generated by the CXF 2.0-incubator
 * Wed Jul 11 17:39:58 CEST 2007
 * Generated source version: 2.0-incubator
 * 
 */

@javax.jws.WebService(name = "ActivationRequesterPortType", serviceName = "ActivationRequesterService",
                      portName = "ActivationRequesterPort",
                      targetNamespace = "http://schemas.xmlsoap.org/ws/2004/10/wscoor", 
                      wsdlLocation = "file:./resources/wsdl/wst/v200410/wscoor.wsdl" ,
		      endpointInterface = "com.atomikos.icatch.jaxb.wsc.v200410.ActivationRequesterPortType")
                      
public class ActivationRequesterPortTypeImpl implements ActivationRequesterPortType {

    private static final Logger LOG = 
        Logger.getLogger(ActivationRequesterPortTypeImpl.class.getPackage().getName());

    /* (non-Javadoc)
     * @see com.atomikos.icatch.jaxb.wsc.v200410.ActivationRequesterPortType#createCoordinationContextResponseOperation(com.atomikos.icatch.jaxb.wsc.v200410.CreateCoordinationContextResponseType  parameters )*
     */
    public void createCoordinationContextResponseOperation(
        com.atomikos.icatch.jaxb.wsc.v200410.CreateCoordinationContextResponseType parameters
    )
    { 
       LOG.info("Executing operation createCoordinationContextResponseOperation");
    }

}
