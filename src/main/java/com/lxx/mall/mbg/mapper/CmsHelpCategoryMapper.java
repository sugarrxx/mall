package com.lxx.mall.mbg.mapper;

import com.lxx.mall.mbg.model.CmsHelpCategory;
import com.lxx.mall.mbg.model.CmsHelpCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsHelpCategoryMapper {
    int countByExample(CmsHelpCategoryExample example);

    int deleteByExample(CmsHelpCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsHelpCategory record);

    int insertSelective(CmsHelpCategory record);

    List<CmsHelpCategory> selectByExample(CmsHelpCategoryExample example);

    CmsHelpCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsHelpCategory record, @Param("example") CmsHelpCategoryExample example);

    int updateByExample(@Param("record") CmsHelpCategory record, @Param("example") CmsHelpCategoryExample example);

    int updateByPrimaryKeySelective(CmsHelpCategory record);

    int updateByPrimaryKey(CmsHelpCategory record);
}