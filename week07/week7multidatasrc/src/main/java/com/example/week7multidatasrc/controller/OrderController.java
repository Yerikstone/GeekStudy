/**
 * Copyright (c) 2016-2021 All Rights Reserved.
 */
package com.example.week7multidatasrc.controller;

import com.example.week7multidatasrc.config.DataSource;
import com.example.week7multidatasrc.entity.SOrder;
import com.example.week7multidatasrc.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ${DESCRIPTION}
 * <p></p>
 * @author: Yerik.Stone
 * @create: at 2021-06-20 20:04
 * @version: 1.0.0
 * @history: modify history
 * <author>              <time>              <version>              <desc>
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping("/add")
    public Long addBatch(){
        List<SOrder> list = new ArrayList<>(1000000);
        for(int i=0;i < 1000000;i++){
            SOrder orderTotal = new SOrder();
            orderTotal.setId(i);
            orderTotal.setOrderId(new Long(i));
            list.add(orderTotal);
        }
        long start = System.currentTimeMillis();
        orderService.addBatch(list);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("耗时"+time/1000);
        return time;
    }

    @RequestMapping("/getOrder")
    @DataSource("master")
    public List<SOrder> getOrder(){

        List<SOrder> list =  orderService.getOrders();

        return list;
    }

}
