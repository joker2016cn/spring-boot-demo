package com.learn.product.web.service;

import com.learn.product.bo.product.ProductBO;
import com.learn.product.vo.product.ProductVO;

import java.util.List;

/**
 * @author LuHailun
 * @Title: ProductService
 * @ProjectName product
 * @Description: TODO
 * @date 2019/4/20 21:50
 */
public interface ProductService {

    void insert(ProductBO bo);

    void delete(long id);

    void update(ProductBO bo);

    ProductVO getOne(long id);

    List<ProductVO> getAll();
}
