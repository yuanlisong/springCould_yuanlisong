package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ApplicationContextConfig
 * @Description: TODO()
 * @author: YuanLiSong
 * @date: 2021/3/1 22:35
 * @Copyright: YuanLiSong
 */
@Configuration
public class ApplicationContextConfig {
	@Bean
	@LoadBalanced // 使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}

