/*
 * Copyright (c) 2018-2999 广州市蓝海创新科技有限公司 All rights reserved.
 *
 * https://www.mall4j.com/
 *
 * 未经允许，不可做商业用途！
 *
 * 版权所有，侵权必究！
 */

package com.yami.shop.bean.distribution;

import lombok.Data;


/**
 * 用户购物数据
 */
@Data
public class UserShoppingDataDto {

    /**
     * 用户消费笔数
     */
    private Double expenseNumber;

    /**
     * 用户消费金额
     */
    private Double sumOfConsumption;
}
