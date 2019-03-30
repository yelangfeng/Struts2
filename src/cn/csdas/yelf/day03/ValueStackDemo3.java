package cn.csdas.yelf.day03;

import cn.csdas.yelf.day03.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

/**
 * 操作ValueStack对象:利用Action本身在值栈中的特性（默认情况下，Action对象压入值栈，其对应的属性也会存入值栈中）
 * 不推荐使用
 * @author yelf
 */
public class ValueStackDemo3 extends ActionSupport {
    private User user;
    public User getUser() {
        return user;
    }

    @Override
    public String execute(){
        //向ValueStack中存值
        user = new User("张三","abc123");
        return SUCCESS;
    }
}
