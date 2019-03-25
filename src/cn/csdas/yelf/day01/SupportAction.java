package cn.csdas.yelf.day01;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action的编写方式三：Action类继承ActionSupport类
 * * 推荐使用继承ActionSupport方式
 * 		* ActionSupport中提供了数据校验、国际化等一系列操作的方法。
 *
 */
public class SupportAction extends ActionSupport {
    public String execute(){
        System.out.println("继承了ActionSupport的SupportAction执行了...");
        return SUCCESS;
    }
}
