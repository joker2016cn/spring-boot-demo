package com.learn.product.vo.product;

import com.learn.product.vo.AbstractVO;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author LuHailun
 * @Title: ProductVO
 * @ProjectName product
 * @Description: TODO
 * @date 2019/4/20 19:15
 */
@Data
@ToString(callSuper = true)
public class ProductVO extends AbstractVO {

    private String name;
    private long number;

    public ProductVO() {
    }

    public ProductVO(String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser, String name, long number) {
        super(remark, createdDate, createdUser, updatedDate, updatedUser);
        this.name = name;
        this.number = number;
    }

    public ProductVO(int id, String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser, String name, long number) {
        super(id, remark, createdDate, createdUser, updatedDate, updatedUser);
        this.name = name;
        this.number = number;
    }
}
