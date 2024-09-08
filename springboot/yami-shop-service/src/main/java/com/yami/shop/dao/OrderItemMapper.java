/*
 * Copyright (c) 2018-2999 广州市蓝海创新科技有限公司 All rights reserved.
 *
 * https://www.mall4j.com/
 *
 * 未经允许，不可做商业用途！
 *
 * 版权所有，侵权必究！
 */

package com.yami.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yami.shop.bean.app.dto.OrderItemDto;
import com.yami.shop.bean.model.OrderItem;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface OrderItemMapper extends BaseMapper<OrderItem> {

	List<OrderItem> listByOrderNumber(@Param("orderNumber") String orderNumber);
	
	void insertBatch(List<OrderItem> orderItems);
	
//	List<OrderItem> getPayByOrderNumber(@Param("orderNumber") String orderNumber);

}