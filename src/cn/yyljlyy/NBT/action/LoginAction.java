package cn.yyljlyy.NBT.action;

import cn.yyljlyy.NBT.bean.TLoginEntity;
import cn.yyljlyy.NBT.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.config.Action;
import org.apache.struts2.config.Namespace;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by lee on 2015/6/16.
 */
@Controller
@Namespace("/")
@Action(name = "login")
@Results({@Result(name = "success",value = "/welcome.jsp"), @Result(name = "error", value = "/index.jsp")})


public class LoginAction extends ActionSupport {

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    private String userName;
    private String pwd;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    @Resource
    UserService userService;

    public void check() {
        Integer id = 1;
        TLoginEntity tLoginEntity = userService.findById(id);
        System.out.println(tLoginEntity.getUsername());

    }
}
