package example;

import java.io.Serializable;

/**
 * Created by Ben on 2016/7/6.
 */
public class LoginVO implements Serializable{
    private String loginName;
    private String password;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

