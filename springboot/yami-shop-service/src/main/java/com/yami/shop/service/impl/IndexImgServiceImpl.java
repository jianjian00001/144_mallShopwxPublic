/*
 * Copyright (c) 2018-2999 广州市蓝海创新科技有限公司 All rights reserved.
 *
 * https://www.mall4j.com/
 *
 * 未经允许，不可做商业用途！
 *
 * 版权所有，侵权必究！
 */

package com.yami.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.yami.shop.bean.model.IndexImg;
import com.yami.shop.dao.IndexImgMapper;
import com.yami.shop.service.IndexImgService;

import java.util.List;

/**
 *
 * @author  on 2024/11/26.
 */
@Service
public class IndexImgServiceImpl extends ServiceImpl<IndexImgMapper, IndexImg> implements IndexImgService {

    @Autowired
    private IndexImgMapper indexImgMapper;

	@Override
	public void deleteIndexImgsByIds(Long[] ids) {
		indexImgMapper.deleteIndexImgsByIds(ids);
	}

    @Override
    @Cacheable(cacheNames = "indexImg", key = "'indexImg'")
    public List<IndexImg> listIndexImgs() {
        return indexImgMapper.listIndexImgs();
    }

    @Override
    @CacheEvict(cacheNames = "indexImg", key = "'indexImg'")
    public void removeIndexImgCache() {
    }
}
