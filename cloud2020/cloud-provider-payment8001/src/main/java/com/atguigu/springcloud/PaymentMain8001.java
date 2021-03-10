package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: PaymentMain8001
 * @Description: 主启动类
 * @author: YuanLiSong
 * @date: 2021/2/23 23:03
 * @Copyright: YuanLiSong
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain8001.class,args);
	}
}
