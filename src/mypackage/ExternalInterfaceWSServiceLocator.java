/**
 * ExternalInterfaceWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class ExternalInterfaceWSServiceLocator extends org.apache.axis.client.Service implements mypackage.ExternalInterfaceWSService {

    public ExternalInterfaceWSServiceLocator() {
    }


    public ExternalInterfaceWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExternalInterfaceWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ExternalInterfaceWS
    private java.lang.String ExternalInterfaceWS_address = "http://localhost:8080/SXFSGDUnitInterface/services/ExternalInterfaceWS";

    public java.lang.String getExternalInterfaceWSAddress() {
        return ExternalInterfaceWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExternalInterfaceWSWSDDServiceName = "ExternalInterfaceWS";

    public java.lang.String getExternalInterfaceWSWSDDServiceName() {
        return ExternalInterfaceWSWSDDServiceName;
    }

    public void setExternalInterfaceWSWSDDServiceName(java.lang.String name) {
        ExternalInterfaceWSWSDDServiceName = name;
    }

    public mypackage.ExternalInterfaceWS_PortType getExternalInterfaceWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExternalInterfaceWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExternalInterfaceWS(endpoint);
    }

    public mypackage.ExternalInterfaceWS_PortType getExternalInterfaceWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.ExternalInterfaceWSSoapBindingStub _stub = new mypackage.ExternalInterfaceWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getExternalInterfaceWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExternalInterfaceWSEndpointAddress(java.lang.String address) {
        ExternalInterfaceWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.ExternalInterfaceWS_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.ExternalInterfaceWSSoapBindingStub _stub = new mypackage.ExternalInterfaceWSSoapBindingStub(new java.net.URL(ExternalInterfaceWS_address), this);
                _stub.setPortName(getExternalInterfaceWSWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ExternalInterfaceWS".equals(inputPortName)) {
            return getExternalInterfaceWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example", "ExternalInterfaceWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://example", "ExternalInterfaceWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ExternalInterfaceWS".equals(portName)) {
            setExternalInterfaceWSEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
