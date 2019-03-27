package cn.csdas.yelf.day02;

import cn.csdas.yelf.day02.domain.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

/**
 * ACTION的数据封装方式一：提供属性的set方法
 * @author yelf
 */
public class UserActionType1 extends ActionSupport {
    private String username;
    private String password;
    private Integer age;
    private Date birthday;
    private Double salary;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String execute(){
        System.out.println(username);
        System.out.println(password);
        System.out.println(age);
        System.out.println(birthday);
        System.out.println(salary);

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        user.setBirthday(birthday);
        user.setSalary(salary);
        System.out.println("方式一："+user);

        return SUCCESS;
    }
}
