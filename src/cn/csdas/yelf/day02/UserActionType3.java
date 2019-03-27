package cn.csdas.yelf.day02;

import cn.csdas.yelf.day02.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * ACTION的数据封装方式三：采用模型驱动的方式
 * 实现ModelDriven接口
 * @author yelf
 */
public class UserActionType3 extends ActionSupport implements ModelDriven<User> {
    //模型驱动使用的对象，前提手动提供对象的实例
    private User user =  new User();//手动实例化User
    //模型驱动使用的方法
    @Override
    public User getModel() {
        return user;
    }

    @Override
    public String execute(){
        System.out.println("方式三："+user);
        return SUCCESS;
    }

}
