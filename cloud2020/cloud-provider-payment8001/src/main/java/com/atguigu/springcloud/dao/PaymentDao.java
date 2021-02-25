package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: PaymentDao
 * @Description: TODO()
 * @author: YuanLiSong
 * @date: 2021/1/18 9:35
 * @Copyright: YuanLiSong
 */
@Mapper
public interface PaymentDao {

	int create(Payment payment);

	Payment getPaymentId(@Param("id") Long id);
}
