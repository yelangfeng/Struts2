package cn.csdas.yelf.day03;

import cn.csdas.yelf.day03.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取值栈数据
 * @author yelf
 */
public class ValueStackDemo5 extends ActionSupport {

    @Override
    public String execute(){
        //向值栈root()中保存一个对象
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        //ValueStack valueStack = (ValueStack)ServletActionContext.getRequest().getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);
        User user = new User("赵贵","das456");
        valueStack.push(user);
        //在值栈中保存一个集合
        List<User> list = new ArrayList<User>();
        list.add(new User("aaa","123"));
        list.add(new User("bbb","456"));
        list.add(new User("ccc","789"));
        valueStack.set("list",list);

        //在值栈（context）中保存数据
        ServletActionContext.getRequest().setAttribute("name","s林国栋");
        ServletActionContext.getRequest().getSession().setAttribute("name","y叶浪峰");
        ServletActionContext.getRequest().getServletContext().setAttribute("name","h三毛");
        return SUCCESS;
    }
}
