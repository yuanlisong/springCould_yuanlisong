package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaMain7001
 * @Description: EurekaMain7001
 * @author: YuanLiSong
 * @date: 2021/3/3 22:18
 * @Copyright: YuanLiSong
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
	public static void main(String[] args) {
		SpringApplication.run(EurekaMain7001.class, args);
	}
}
