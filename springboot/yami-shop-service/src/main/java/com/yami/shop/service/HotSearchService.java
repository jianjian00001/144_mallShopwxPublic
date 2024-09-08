/*
 * Copyright (c) 2018-2999 广州市蓝海创新科技有限公司 All rights reserved.
 *
 * https://www.mall4j.com/
 *
 * 未经允许，不可做商业用途！
 *
 * 版权所有，侵权必究！
 */

package com.yami.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yami.shop.bean.dto.HotSearchDto;
import com.yami.shop.bean.model.HotSearch;
import com.yami.shop.dao.HotSearchMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *
 * @author  on 2019/03/27.
 */
public interface HotSearchService extends IService<HotSearch> {

    List<HotSearchDto> getHotSearchDtoByshopId(Long shopId);

    void removeHotSearchDtoCacheByshopId(Long shopId);
}
