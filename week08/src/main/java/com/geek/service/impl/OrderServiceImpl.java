/**
 * Copyright (c) 2016-2021 All Rights Reserved.
 */
package com.geek.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.geek.entity.SOrder;
import com.geek.mapper.OrderMapper;
import com.geek.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ${DESCRIPTION}
 * <p></p>
 * @author: Yerik.Stone
 * @create: at 2021-06-20 20:26
 * @version: 1.0.0
 * @history: modify history
 * <author>              <time>              <version>              <desc>
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, SOrder> implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void addBatch(List<SOrder> list) {
      //方案1 循环插入
        for(SOrder order : list){
            orderMapper.insert(order);
        }
    }

    @Override
    public List<SOrder> getOrders() {
//        Map map = new HashMap<>();
//        map.put("id",1);
        SOrder sOrder = orderMapper.selectById(1);
        List<SOrder> list = new ArrayList<SOrder>();
        list.add(sOrder);
        return list;
    }
}
