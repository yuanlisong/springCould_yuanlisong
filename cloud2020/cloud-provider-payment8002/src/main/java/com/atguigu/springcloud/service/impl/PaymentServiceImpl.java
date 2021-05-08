package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentServiceImpl
 * @Description: TODO()
 * @author: YuanLiSong
 * @date: 2021/2/25 22:41
 * @Copyright: YuanLiSong
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	//	@Resource
//	private PaymentDao paymentDao;
	private final PaymentDao paymentDao;

	@Autowired
	public PaymentServiceImpl(PaymentDao paymentDao) {
		this.paymentDao = paymentDao;
	}

	public int create(Payment payment) {
		return paymentDao.create(payment);
	}

	public Payment getPaymentId(Long id) {
		return paymentDao.getPaymentId(id);
	}
}
