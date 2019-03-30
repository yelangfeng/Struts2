package cn.csdas.yelf.day03;

import cn.csdas.yelf.day03.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

/**
 * 操作ValueStack对象:调用值栈中的方法实现，推荐使用，考虑压栈问题
 * @author yelf
 */
public class ValueStackDemo4 extends ActionSupport {

    @Override
    public String execute(){
        //向ValueStack中存值
        //获得值栈对象
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        //ValueStack valueStack = (ValueStack)ServletActionContext.getRequest().getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);
        //使用ValueStack的push(Object obj)、set(String key,Object obj)进行存值
        User user = new User("李四","das456");
        //现在user在栈顶
        valueStack.push(user);
        return SUCCESS;
    }
}
