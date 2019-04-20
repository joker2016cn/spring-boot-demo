package com.learn.product.web.service;

import com.learn.product.bo.product.ProductBO;
import com.learn.product.dao.entity.product.ProductEntity;
import com.learn.product.dao.mapper.product.ProductMapper;
import com.learn.product.vo.product.ProductVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LuHailun
 * @Title: ProductServiceImpl
 * @ProjectName product
 * @Description: TODO
 * @date 2019/4/20 21:50
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    public void insert(ProductBO bo) {
        ProductEntity entity = new ProductEntity();
        BeanUtils.copyProperties(bo, entity);
        productMapper.insert(entity);
    }

    public void delete(long id) {
        productMapper.delete(id);
    }

    public void update(ProductBO bo) {
        ProductEntity entity = new ProductEntity();
        BeanUtils.copyProperties(bo, entity);
        productMapper.update(entity);
    }

    public ProductVO getOne(long id) {
        ProductVO vo = new ProductVO();
        ProductEntity entity = productMapper.getOne(id);
        BeanUtils.copyProperties(entity, vo);
        return vo;
    }

    public List<ProductVO> getAll() {

        List<ProductVO> vos = new ArrayList<ProductVO>();
        List<ProductEntity> entities = productMapper.getAll();
        for (ProductEntity entity : entities) {
            ProductVO vo = new ProductVO();
            BeanUtils.copyProperties(entity, vo);
            vos.add(vo);
        }
        return vos;
    }
}
