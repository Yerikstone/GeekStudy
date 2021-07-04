package io.syh.rpcfx.demo.provider;

import io.syh.rpcfx.demo.api.User;
import io.syh.rpcfx.demo.api.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User findById(int id) {
        return new User(id, "SYH" + System.currentTimeMillis());
    }
}
