package com.linkai.shop.mapper;

import com.linkai.shop.pojo.AdCategory;
import com.linkai.shop.pojo.AdCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdCategoryMapper {
    int countByExample(AdCategoryExample example);

    int deleteByExample(AdCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdCategory record);

    int insertSelective(AdCategory record);

    List<AdCategory> selectByExample(AdCategoryExample example);

    AdCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdCategory record, @Param("example") AdCategoryExample example);

    int updateByExample(@Param("record") AdCategory record, @Param("example") AdCategoryExample example);

    int updateByPrimaryKeySelective(AdCategory record);

    int updateByPrimaryKey(AdCategory record);
}