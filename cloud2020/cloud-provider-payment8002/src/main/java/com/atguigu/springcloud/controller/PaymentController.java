package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentController
 * @Description: PaymentController
 * @author: YuanLiSong
 * @date: 2021/2/25 22:46
 * @Copyright: YuanLiSong
 */
@RestController
@Slf4j
public class PaymentController {

	@Resource
	private PaymentService paymentService;

	@Value("${server.port}")
	private String serverPort;

	@PostMapping(value = "/payment/create")
	public CommonResult create(@RequestBody Payment payment){
		int result = paymentService.create(payment);
		log.info("=====插入结果=====:"+result);
		if (result > 0) {
			return new CommonResult(200, "插入成功,访问服务端口：" + serverPort, result);
		} else {
			return new CommonResult(500, "插入失败,访问服务端口：" + serverPort, result);
		}
	}

	@GetMapping(value = "/payment/get/{id}")
	public CommonResult<Payment> getPaymentId(@PathVariable("id") Long id){
		Payment payment = paymentService.getPaymentId(id);
		CommonResult<Payment> commonResult = new CommonResult<>();
		commonResult.setCode(200);
		commonResult.setMessage("ok,访问服务端口：" + serverPort);
		commonResult.setData(payment);
		return commonResult;
	}
}
