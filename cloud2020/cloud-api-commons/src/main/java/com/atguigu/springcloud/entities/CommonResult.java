package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: CommonResult
 * @Description: TODO()
 * @author: YuanLiSong
 * @date: 2021/1/15 16:38
 * @Copyright: YuanLiSong
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
	private Integer code;
	private String message;
	private T data;

	public CommonResult(Integer code, String message) {
		this.code = code;
		this.message = message;
		this.data = null;
	}
}