package cn.csdas.yelf.day03;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * ValueStack的内部结构
 * @author yelf
 */
public class ValueStackDemo1  extends ActionSupport {
    @Override
    public String execute(){
        //获得值栈
        ValueStack valueStack = ActionContext.getContext().getValueStack();

        return SUCCESS;
    }
}
