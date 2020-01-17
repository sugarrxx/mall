package com.lxx.mall.common.api;

/**
 * 封装API的错误码
 *
 * @author <a href="mailto:lixiaoxiang@vpgame.cn">lxx</a>
 * @date 2020-01-16
 */
public interface IErrorCode {

    /**
     * 获取错误码
     *
     * @return Long
     */
    Long getCode();

    /**
     * 获取错误信息
     *
     * @return String
     */
    String getMessage();
}
