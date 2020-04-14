package com.linkai.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkai.shop.mapper.AdCategoryMapper;
import com.linkai.shop.mapper.AdContentMapper;
import com.linkai.shop.pojo.AdCategory;
import com.linkai.shop.pojo.AdCategoryExample;
import com.linkai.shop.pojo.AdContent;
import com.linkai.shop.pojo.AdContentExample;
import com.linkai.shop.service.AdService;

//广告管理服务实现

@Service
public class AdServiceImpl implements AdService {

	@Autowired
	private AdCategoryMapper adCategoryMapper;
	@Autowired
	private AdContentMapper adContentMapper;

	@Override
	public List<AdCategory> findAllAdCategory() {
		AdCategoryExample example = new AdCategoryExample();
		List<AdCategory> list = adCategoryMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<AdContent> findAllAdContent() {
		AdContentExample example = new AdContentExample();
		List<AdContent> list = adContentMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<AdContent> findAllAdContent(Long id) {
		AdContent ad=new AdContent();
		ad.setCategoryid1(id);
		ad.setCategoryid2(id);
		ad.setCategoryid3(id);
		List<AdContent> list = adContentMapper.selectByAdContent(ad);
		return list;
	}

}
