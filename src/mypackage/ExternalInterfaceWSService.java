/**
 * ExternalInterfaceWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface ExternalInterfaceWSService extends javax.xml.rpc.Service {
    public java.lang.String getExternalInterfaceWSAddress();

    public mypackage.ExternalInterfaceWS_PortType getExternalInterfaceWS() throws javax.xml.rpc.ServiceException;

    public mypackage.ExternalInterfaceWS_PortType getExternalInterfaceWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
