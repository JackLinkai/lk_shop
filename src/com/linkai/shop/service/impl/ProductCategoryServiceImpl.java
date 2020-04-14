package com.linkai.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkai.shop.mapper.ProductCategoryMapper;
import com.linkai.shop.pojo.ProductCategory;
import com.linkai.shop.pojo.ProductCategoryExample;
import com.linkai.shop.service.ProductCategoryService;

//商品分类管理实现类
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	@Autowired
	private ProductCategoryMapper productCategoryMapper;

	//查询全部商品分类
	@Override
	public List<ProductCategory> findAllProdCat() {
		
		ProductCategoryExample example=new ProductCategoryExample();
		List<ProductCategory> list = productCategoryMapper.selectByExample(example);
		return list;
	}

}
