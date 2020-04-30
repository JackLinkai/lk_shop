
package com.linkai.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkai.shop.pojo.Brand;
import com.linkai.shop.service.BrandService;

//品牌管理controller

@RestController
@RequestMapping("/brand")
public class BrandController {
	 
	@Autowired
	private BrandService brandService;

	//查询品牌
	@RequestMapping("/findAllBrand")
	public List<Brand> findAllBrand() {
		List<Brand> list = brandService.findAllBrand();
		return list;
	}
}
