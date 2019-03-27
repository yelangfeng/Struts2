package cn.csdas.yelf.day02;

import cn.csdas.yelf.day02.domain.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

/**
 * ACTION的数据封装方式二：在页面中提供表达式的方式
 * @author yelf
 */
public class UserActionType2 extends ActionSupport {
    //提供一个User对象
    private User user;
    //提供User的set和get方法：一定要提供get方法
    //因为拦截器完成数据封装，需要创建User对象，通过get方法可以获得同一个对象，将数据封装到同一个对象中
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String execute(){
        System.out.println("方式二："+user);
        return SUCCESS;
    }
}
