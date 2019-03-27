package cn.csdas.yelf.day02;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

/**
 * 访问Servlet的API
 * @author yelf
 */
public class ServletAPI extends ActionSupport {
    /**
     * 访问Servlet的API的方式一：完全解耦的方式
     * @return
     */
    public String type1(){
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

    /**
     * 访问Servlet的API的方式二：使用原生的访问方式
     * @return
     */
    public String type2(){
        //接收参数
        //直接获得request对象，通过ServletActionContext
        HttpServletRequest request = ServletActionContext.getRequest();
        //调用ActionContext的方法
        Map<String, String[]> map = request.getParameterMap();
        for (String key : map.keySet()) {
            String[] values = (String[]) map.get(key);
            System.out.println(key+":"+ Arrays.toString(values));
        }
        //向域对象存入数据
        request.setAttribute("req","request的数据");
        request.getSession().setAttribute("sess","session的数据");
        ServletActionContext.getServletContext().setAttribute("app","application的数据");
        return SUCCESS;
    }
}
