package client;


import mypackage.ExternalInterfaceWSServiceLocator;
import mypackage.ExternalInterfaceWS_PortType;

import java.rmi.RemoteException;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2010-9-26
 * Time: 9:48:44
 * To change this template use File | Settings | File Templates.
 */
public class ExternalUnitBOH1 {
    //private static ExternalUnitBOH instance = new ExternalUnitBOH();
    private static ExternalInterfaceWS_PortType service;
    private ExternalInterfaceWSServiceLocator locator = new ExternalInterfaceWSServiceLocator();
    
    public ExternalUnitBOH1()
	{
	}

	public void init() throws Exception
	{
		if(service==null)
		{
			if(locator==null)
			{
				locator = new ExternalInterfaceWSServiceLocator();
			}
			service = (ExternalInterfaceWS_PortType)locator.getExternalInterfaceWS();
//			service.setMaintainSession(true);
		}
	}

//    public static ExternalUnitBOH getInstance() {
//        return instance;
//    } 
    
    public void setHostAddress(String ip,String port) throws RemoteException
	{
		locator.setExternalInterfaceWSEndpointAddress("http://localhost:8080/SXFSGDUnitInterface/services/ExternalInterfaceWS");
	}


    public String login(String loginname,String passowrd) throws RemoteException {
        String returnCode="";
        String retvo = null;
    	try{
    	 retvo = service.login(loginname,passowrd);
//    	returnCode=retvo.getReturnCode();
//        System.out.println("调用webservice返回结果:");
//        System.out.println("登录信息码loginKey="+retvo.getLoginKey());
//        System.out.println("返回码returnCode="+retvo.getReturnCode());
        System.out.println("出错原因reason="+retvo);
        System.out.println("----------------------------------------------------\n");
    	}catch(Exception re){
    		re.printStackTrace();
    	}
        return retvo;
    }

    public static void main(String[] args) {
        ExternalUnitBOH1 service = new ExternalUnitBOH1();
        try {
            service.init();
            System.out.println(service.login("ben","ben"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
