package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Payment
 * @Description: 实体类
 * @author: YuanLiSong
 * @date: 2021/2/25 21:28
 * @Copyright: YuanLiSong
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	private Long id;
	private String serial;
}
