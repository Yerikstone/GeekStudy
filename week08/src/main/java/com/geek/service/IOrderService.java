/**
 * Copyright (c) 2016-2021 All Rights Reserved.
 */
package com.geek.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.geek.entity.SOrder;

import java.util.List;

/**
 * @description: ${DESCRIPTION}
 * <p></p>
 * @author: Yerik.Stone
 * @create: at 2021-06-20 20:25
 * @version: 1.0.0
 * @history: modify history
 * <author>              <time>              <version>              <desc>
 */
public interface IOrderService extends IService<SOrder> {
    void addBatch(List<SOrder> list);

   List<SOrder> getOrders();
}
