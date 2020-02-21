package com.lxx.mall.service;

import com.lxx.mall.common.api.CommonResult;

/**
 * @author <a href="mailto:lixiaoxiang@vpgame.cn">lxx</a>
 * @date 2020-01-17
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
