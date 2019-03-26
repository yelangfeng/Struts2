package cn.csdas.yelf.day02.demo1;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Arrays;
import java.util.Map;

/**
 * 访问Servlet的API的方式一：完全解耦的方式
 * @author yelf
 */
public class ServletAPI extends ActionSupport {
    @Override
    public String execute(){
        //接收参数
        //利用Struts2的ActionContext对象
        ActionContext context = ActionContext.getContext();
        //调用ActionContext的方法
        Map<String, Object> map = context.getParameters();
        for (String key : map.keySet()) {
            String[] values = (String[]) map.get(key);
            System.out.println(key+":"+ Arrays.toString(values));
        }
        //向域对象存入数据
        context.put("req","request数据"); //相当于request.setAttribute()
        context.getSession().put("sess","session数据");//相当于session.setAttribute()
        context.getApplication().put("app","application数据");//相当于application.setAttribute()
        return SUCCESS;
    }
}
