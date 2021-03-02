package com.atguigu.springcloud.config;

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
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}

