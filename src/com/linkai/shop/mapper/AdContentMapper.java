package com.linkai.shop.mapper;

import com.linkai.shop.pojo.AdContent;
import com.linkai.shop.pojo.AdContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdContentMapper {
    int countByExample(AdContentExample example);

    int deleteByExample(AdContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdContent record);

    int insertSelective(AdContent record);

    List<AdContent> selectByExample(AdContentExample example);

    AdContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdContent record, @Param("example") AdContentExample example);

    int updateByExample(@Param("record") AdContent record, @Param("example") AdContentExample example);

    int updateByPrimaryKeySelective(AdContent record);

    int updateByPrimaryKey(AdContent record);
    
    List<AdContent> selectByAdContent(AdContent record);
}