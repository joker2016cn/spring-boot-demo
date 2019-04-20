package com.learn.product.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author LuHailun
 * @Title: AbstractVO
 * @ProjectName product
 * @Description: TODO
 * @date 2019/4/20 19:28
 */
@Data
@ToString
public abstract class AbstractVO {

    private int id;
    private String remark;
    private Date createdDate;
    private int createdUser;
    private Date updatedDate;
    private int updatedUser;

    public AbstractVO() {
    }

    public AbstractVO(String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser) {
        this.remark = remark;
        this.createdDate = createdDate;
        this.createdUser = createdUser;
        this.updatedDate = updatedDate;
        this.updatedUser = updatedUser;
    }

    public AbstractVO(int id, String remark, Date createdDate, int createdUser, Date updatedDate, int updatedUser) {
        this.id = id;
        this.remark = remark;
        this.createdDate = createdDate;
        this.createdUser = createdUser;
        this.updatedDate = updatedDate;
        this.updatedUser = updatedUser;
    }
}
