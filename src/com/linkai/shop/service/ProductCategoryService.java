package com.linkai.shop.service;

import java.util.List;

import com.linkai.shop.pojo.ProductCategory;

//商品分类管理-service
public interface ProductCategoryService {
	
	//查询所有商品分类
		public List<ProductCategory> findAllProdCat();

}