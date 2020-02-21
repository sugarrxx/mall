package com.lxx.mall.mbg.mapper;

import com.lxx.mall.mbg.model.SmsHomeBrand;
import com.lxx.mall.mbg.model.SmsHomeBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeBrandMapper {
    int countByExample(SmsHomeBrandExample example);

    int deleteByExample(SmsHomeBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeBrand record);

    int insertSelective(SmsHomeBrand record);

    List<SmsHomeBrand> selectByExample(SmsHomeBrandExample example);

    SmsHomeBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsHomeBrand record, @Param("example") SmsHomeBrandExample example);

    int updateByExample(@Param("record") SmsHomeBrand record, @Param("example") SmsHomeBrandExample example);

    int updateByPrimaryKeySelective(SmsHomeBrand record);

    int updateByPrimaryKey(SmsHomeBrand record);
}