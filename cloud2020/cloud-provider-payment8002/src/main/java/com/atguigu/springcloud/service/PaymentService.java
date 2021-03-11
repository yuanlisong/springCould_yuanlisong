package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: PaymentService
 * @Description: TODO()
 * @author: YuanLiSong
 * @date: 2021/2/25 22:40
 * @Copyright: YuanLiSong
 */
public interface PaymentService {

	int create(Payment payment);

	Payment getPaymentId(@Param("id") Long id);
}
