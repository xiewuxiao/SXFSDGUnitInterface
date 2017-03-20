package client;

import example.LoginVO;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.encoding.XMLType;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/** 发酵乳使用代而不一成迥
 * Created by Ben on 2016/1/26.
 * //不需要生成人工台罗伯斯驱除
 */
public class HelloWorldUserMyType{

    public static void main(String[] args) throws ServiceException, RemoteException {
        String endpoint = "http://localhost:8080/SXFSGDUnitInterface/services/ExternalInterfaceWS?wsdl";//要发发磅wd

//直接引用远程的wsdl文件

        //以下都是套路
        Service service = new Service();

        Call call = (Call) service.createCall();

        call.setTargetEndpointAddress(endpoint);

        call.setOperationName("login");//WSDL里面描述的接口名称
        call.setMaintainSession(true);
        QName qn = new QName("http://vo.webservices.gfmis.todaytech.com", "LoginVO");
        call.registerTypeMapping(LoginVO.class, qn, new BeanSerializerFactory(LoginVO.class, qn), new BeanDeserializerFactory(LoginVO.class, qn));
        call.setOperationStyle(Style.RPC);
        call.setOperationUse(Use.ENCODED);
        call.setSOAPActionURI(null);

        String result = (String) call.invoke(new Object[]{"ben", "ben"});

//给方法传递参数，并且调用方法

        System.out.println(result);


    }
}
