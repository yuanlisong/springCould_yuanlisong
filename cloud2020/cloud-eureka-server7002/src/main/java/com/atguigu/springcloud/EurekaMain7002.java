package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaMain7002
 * @Description: TODO()
 * @author: YuanLiSong
 * @date: 2021/3/3 22:42
 * @Copyright: YuanLiSong
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
	public static void main(String[] args) {
		SpringApplication.run(EurekaMain7002.class, args);
	}
}
