package example;

/**
 * Created by Ben on 2016/7/6.
 */
    public class ExternalInterfaceWS {
    public String login(String loginName, String password) {
        if (loginName.equals("ben") && password.equals("ben")) return "登录成功";
        else return "登录失败，用户名或密码不正确";
    }

    public String sendRefundResult(String xml) {
        System.out.println("发送过来的数据:");
        System.out.println(xml);
        System.out.println("更新数据中。。。。。");
        return "接收成功";
    }

    public String login(LoginVO loginVO) {
        if (loginVO.getLoginName().equals("ben") && loginVO.getPassword().equals("ben")) return "登录成功";
        else return "登录失败，用户名或密码不正确";
    }
}
