package com.lxx.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:lixiaoxiang@vpgame.cn">lxx</a>
 * @date 2020-01-16
 */
@Configuration
@MapperScan({"com.lxx.mall.mbg.mapper", "com.lxx.mall.dao"})
public class MyBatisConfig {
}
