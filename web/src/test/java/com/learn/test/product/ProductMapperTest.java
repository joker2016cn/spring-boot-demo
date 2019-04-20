package com.learn.test.product;

import com.learn.product.bo.product.ProductBO;
import com.learn.product.dao.entity.product.ProductEntity;
import com.learn.product.dao.mapper.product.ProductMapper;
import com.learn.product.vo.product.ProductVO;
import com.learn.product.web.WebApplication;
import com.learn.product.web.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author LuHailun
 * @Title: ProductMapperTest
 * @ProjectName product
 * @Description: TODO
 * @date 2019/4/20 21:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebApplication.class)
public class ProductMapperTest {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductService productService;

    @Test
    public void testGetOne() throws Exception {
        ProductEntity entity = productMapper.getOne(1L);
        System.out.println(entity.getName());
    }

    @Test
    public void testInsert() throws Exception {
        ProductEntity entity = new ProductEntity();
        entity.setName("油条");
        entity.setNumber(10L);
        productMapper.insert(entity);
    }

    @Test
    public void testServiceInsert() throws Exception {
        ProductBO bo = new ProductBO();
        bo.setName("豆浆");
        bo.setNumber(10);
        productService.insert(bo);
    }

    @Test
    public void testServiceGetOne() throws Exception {
        ProductVO vo = productService.getOne(2);
        System.out.println(vo.toString());
    }
}
