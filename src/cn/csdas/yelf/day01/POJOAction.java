package cn.csdas.yelf.day01;

/**
 * Action的编写方式：Action类是一个POJO的类，未继承未实现
 */
public class POJOAction {
    public String execute(){
        System.out.println("POJO类的Action执行了...");
        return "success";
    }
}
