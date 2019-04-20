package com.learn.product.web.controller;

import com.learn.product.bo.product.ProductBO;
import com.learn.product.vo.product.ProductVO;
import com.learn.product.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author LuHailun
 * @Title: ProductController
 * @ProjectName product
 * @Description: TODO
 * @date 2019/4/20 19:26
 */
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public String getProduct() {

        Date now = new Date();

        ProductVO vo = new ProductVO();
        vo.setName("煎饼果子");
        vo.setNumber(5);
        vo.setCreatedDate(now);
        vo.setCreatedUser(1);
        vo.setUpdatedDate(now);
        vo.setUpdatedUser(1);
        return vo.toString();
    }

    @PostMapping("/product")
    public void saveProduct() {

        Date now = new Date();

        ProductBO bo = new ProductBO();
        bo.setName("煎饼果子");
        bo.setNumber(10);
        bo.setCreatedDate(now);
        bo.setCreatedUser(1);
        bo.setUpdatedDate(now);
        bo.setUpdatedUser(1);
    }
}
