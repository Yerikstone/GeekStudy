/**
 * Copyright (c) 2016-2021 All Rights Reserved.
 */
package com.geek.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.geek.entity.SOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: ${DESCRIPTION}
 * <p></p>
 * @author: Yerik.Stone
 * @create: at 2021-06-20 20:10
 * @version: 1.0.0
 * @history: modify history
 * <author>              <time>              <version>              <desc>
 */
@Mapper
public interface OrderMapper extends BaseMapper<SOrder> {
}
