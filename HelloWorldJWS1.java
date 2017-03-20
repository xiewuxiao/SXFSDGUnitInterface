package client;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.encoding.XMLType;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created by Ben on 2016/1/26.
 */
public class HelloWorldJWS1 {

    public static void main(String[] args) throws ServiceException, RemoteException {
        String endpoint = "http://localhost:8080/SXFSGDUnitInterface/services/ExternalInterfaceWS?wsdl";


//直接引用远程的wsdl文件

        //以下都是套路
        Service service = new Service();

        Call call = (Call) service.createCall();

        call.setTargetEndpointAddress(endpoint);

        call.setOperationName("sendRefundResult");//WSDL里面描述的接口名称
        call.setMaintainSession(true);
            call.addParameter(new QName("http://face.webservices.gfmis.todaytech.com", "xml"), XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);//接口的参数
//        call.addParameter(new QName("http://example","password"), XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);//接口的参数
        call.setReturnType(XMLType.XSD_STRING);//设置返回类型
        call.setOperationStyle(Style.RPC);
        call.setOperationUse(Use.ENCODED);
        call.setSOAPActionURI(null);

        String result = (String) call.invoke(new Object[]{"你奶奶个熊"});

//给方法传递参数，并且调用方法

        System.out.println(result);


    }
}
