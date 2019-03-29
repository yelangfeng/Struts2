package cn.csdas.yelf.day02;

import cn.csdas.yelf.day01.ProductAction;
import cn.csdas.yelf.day02.domain.Product;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 * 复杂数据类型封装：封装到List集合中,类似基本数据封装的方式二
 * @author yelf
 */
public class ProductAction1 extends ActionSupport {

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String execute() throws Exception{
        for (Product product : products) {
            System.out.println(product.toString());
        }
        return SUCCESS;
    }
}
