package com.lxx.mall.service;


import com.lxx.mall.dto.OssCallbackResult;
import com.lxx.mall.dto.OssPolicyResult;
import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 *
 * @author lixiaoxiang
 */
public interface OssService {

    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
