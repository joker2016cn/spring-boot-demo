package com.learn.product.bo.product;

import com.learn.product.bo.AbstractBO;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author LuHailun
 * @Title: ProductBO
 * @ProjectName product
 * @Description: TODO
 * @date 2019/4/20 19:15
 */
@Data
@ToString
public class ProductBO extends AbstractBO {

    private String name;
    private long number;

    public ProductBO() {
    }

    public ProductBO(String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser, String name, long number) {
        super(remark, createdDate, createdUser, updatedDate, updatedUser);
        this.name = name;
        this.number = number;
    }

    public ProductBO(int id, String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser, String name, long number) {
        super(id, remark, createdDate, createdUser, updatedDate, updatedUser);
        this.name = name;
        this.number = number;
    }
}
