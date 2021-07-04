package io.syh.rpcfx.demo.provider;

import io.syh.rpcfx.demo.api.Order;
import io.syh.rpcfx.demo.api.OrderService;

public class OrderServiceImpl implements OrderService {

    @Override
    public Order findOrderById(int id) {
        return new Order(id, "Yerik" + System.currentTimeMillis(), 9.9f);
    }
}
