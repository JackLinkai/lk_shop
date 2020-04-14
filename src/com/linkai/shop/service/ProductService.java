package com.linkai.shop.service;

import java.util.List;

import com.linkai.shop.domain.ProductInfo;
import com.linkai.shop.pojo.Product;
//商品管理服务接口

public interface ProductService {

	// 查询全部商品
	public List<Product> findAllProd();

	// 添加商品
	public void addProdInfo(ProductInfo prodInfo);

	// 根据商品名称模糊查询
	public List<Product> findByProdName(String productName);

	// 根据商品id获取信息
	public Product findProductById(Long id);
}
