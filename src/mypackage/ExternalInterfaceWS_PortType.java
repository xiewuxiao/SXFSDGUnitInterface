/**
 * ExternalInterfaceWS_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface ExternalInterfaceWS_PortType extends java.rmi.Remote {
    public java.lang.String login(java.lang.String loginName, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String sendRefundResult(java.lang.String xml) throws java.rmi.RemoteException;
}
