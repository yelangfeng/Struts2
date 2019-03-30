package cn.csdas.yelf.day03;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

/**
 * 获得ValueStack对象
 * @author yelf
 */
public class ValueStackDemo2 extends ActionSupport {
    @Override
    public String execute(){
        //第一种：通过ActionContext获得值栈
        ValueStack valueStack1 = ActionContext.getContext().getValueStack();
        //第二种：通过request对象获得值栈
        ValueStack valueStack2 = (ValueStack)ServletActionContext.getRequest().getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);
        //一个Action的实例，只会创建一个人ValueStack对象
        System.out.println(valueStack1==valueStack2);
        return SUCCESS;
    }
}
