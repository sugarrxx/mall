package com.lxx.mall.service;

import com.lxx.mall.mbg.model.PmsBrand;
import java.util.List;

/**
 * @author <a href="mailto:lixiaoxiang@vpgame.cn">lxx</a>
 * @date 2020-01-16
 */
public interface PmsBrandService {

    /**
     * 获取所有品牌
     *
     * @return List<PmsBrand>
     */
    List<PmsBrand> listAllBrand();

    /**
     * 新增品牌
     *
     * @param brand brand
     * @return 成功返回1
     */
    int createBrand(PmsBrand brand);

    /**
     * 编辑品牌
     *
     * @param id 品牌ID
     * @param brand brand
     * @return 成功返回1
     */
    int updateBrand(Long id, PmsBrand brand);

    /**
     * 删除品牌(硬删除)
     *
     * @param id 品牌ID
     * @return 成功返回1
     */
    int deleteBrand(Long id);

    /**
     * 分页查询品牌
     *
     * @param pageNum pageNum
     * @param pageSize pageSize
     * @return List<PmsBrand>
     */
    List<PmsBrand> listBrand(int pageNum, int pageSize);

    /**
     * 获取品牌
     *
     * @param id 品牌ID
     * @return 没有返回null
     */
    PmsBrand getBrand(Long id);
}
