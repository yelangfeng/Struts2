package cn.csdas.yelf.day01;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    @Override
    public String execute(){
        return NONE;
    }

    public String save(){
        System.out.println("UserAction的保存方法---");
        return SUCCESS;
    }

    public String delete(){
        System.out.println("UserAction的删除方法-----");
        return SUCCESS;
    }

    public String update(){
        System.out.println("UserAction的修改方法-------");
        return SUCCESS;
    }

    public String find(){
        System.out.println("UserAction的查询方法----------");
        return SUCCESS;
    }
}
