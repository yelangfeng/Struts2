package cn.csdas.yelf.day04.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 自定义拦截器一
 * @author yelf
 */
public class Interceptor1 extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("Interceptor1执行了...");
        String invoke = actionInvocation.invoke();
        System.out.println("Interceptor1执行结束了...");
        return invoke;
    }
}
