package cn.csdas.yelf.day04;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author yelf
 */
public class InterceptorAction1 extends ActionSupport {
    @Override
    public String execute(){
        System.out.println("InterceptorAction1执行了...");
        return SUCCESS;
    }
}
