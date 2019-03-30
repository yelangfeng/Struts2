package cn.csdas.yelf.day03;

import cn.csdas.yelf.day03.domain.User;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.jupiter.api.Test;

/**
 * OGNL在Java环境下的使用
 * @author yelf
 */

public class OgnlDemo1 {
    /**
     * OGNL调用对象的方法
     */
    @Test
    public void demo1() throws OgnlException {
        //获得context
        OgnlContext context = new OgnlContext();
        //获得根对象
        Object root = context.getRoot();
        //执行表达式
        Object obj = Ognl.getValue("'hello world!'.length()", context, root);
        System.out.println(obj);
    }
    /**
     * Ognl访问对象的静态方法
     */
    @Test
    public void demo2() throws OgnlException {
        //获得context
        OgnlContext context = new OgnlContext();
        //获得根对象
        Object root = context.getRoot();
        //执行表达式：@类名@方法名
        Object obj = Ognl.getValue("@java.lang.Math@random()", context, root);
        System.out.println(obj);
    }

    /**
     * Ognl访问root中的数据,不需要加#
     */
    @Test
    public void demo3() throws OgnlException {
        //获得context
        OgnlContext context = new OgnlContext();
        //执行表达式：
        User user = new User("yelf","123");
        context.setRoot(user);
        //获得根对象
        Object root = context.getRoot();

        Object username = Ognl.getValue("username", context, root);
        Object password = Ognl.getValue("password", context, root);
        System.out.println("username:"+username+"\n"+"password:"+password);
    }

    /**
     * Ognl访问OgnlContext中的数据,需要加#
     */
    @Test
    public void demo4() throws OgnlException {
        //获得context
        OgnlContext context = new OgnlContext();
        //获得根对象
        Object root = context.getRoot();
        //向context中存入数据
        context.put("name","叶浪峰");
        //执行表达式：
        Object name = Ognl.getValue("#name", context, root);
        System.out.println(name);
    }
}
