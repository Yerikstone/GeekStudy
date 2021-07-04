package io.syh.rpcfx.demo.provider;

import io.syh.rpcfx.api.RpcfxRequest;
import io.syh.rpcfx.api.RpcfxResolver;
import io.syh.rpcfx.api.RpcfxResponse;
import io.syh.rpcfx.demo.api.OrderService;
import io.syh.rpcfx.demo.api.UserService;
import io.syh.rpcfx.server.RpcfxInvoker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RpcfxServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpcfxServerApplication.class, args);
    }

    @Autowired
    RpcfxInvoker invoker;

    @PostMapping("/")
    public RpcfxResponse invoke(@RequestBody RpcfxRequest request) {
        return invoker.invoke(request);
    }

    @Bean
    public RpcfxInvoker createInvoker(@Autowired RpcfxResolver resolver) {
        return new RpcfxInvoker(resolver);
    }

    @Bean
    public RpcfxResolver createResolver() {
        return new DemoResolver();
    }

    // 能否去掉name
    //
    @Bean(name = "io.syh.rpcfx.demo.api.UserService")
    public UserService createUserService() {
        return new UserServiceImpl();
    }

    @Bean(name = "io.syh.rpcfx.demo.api.OrderService")
    public OrderService createOrderService() {
        return new OrderServiceImpl();
    }

}
