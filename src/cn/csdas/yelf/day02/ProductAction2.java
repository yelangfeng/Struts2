package cn.csdas.yelf.day02;

import cn.csdas.yelf.day02.domain.Product;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.util.Map;

/**
 * 复杂数据类型封装：封装到Map中,类似基本数据封装的方式二
 * @author yelf
 */
public class ProductAction2 extends ActionSupport {

    private Map<String,Product> map;

    public Map<String, Product> getMap() {
        return map;
    }

    public void setMap(Map<String, Product> map) {
        this.map = map;
    }

    @Override
    public String execute() throws Exception{
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
        return SUCCESS;
    }
}
