package com.linkai.shop.service;

import java.util.List;

import com.linkai.shop.pojo.AdCategory;
import com.linkai.shop.pojo.AdContent;

//广告管理服务接口

public interface AdService {
	
	//查询全部广告分类
	public List<AdCategory> findAllAdCategory();

	//查询全部广告内容
	public List<AdContent> findAllAdContent();
	
	//根据广告分类id查询该分类下全部广告内容
	public List<AdContent> findAllAdContent(Long id);
}
