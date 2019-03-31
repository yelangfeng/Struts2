package cn.csdas.yelf.day04.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 自定义拦截器二
 * @author yelf
 */
public class Interceptor2 extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("Interceptor2执行了...");
        String invoke = actionInvocation.invoke();
        System.out.println("Interceptor2执行结束了...");
        return invoke;
    }
}
