package com.cloud.app;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ClientServiceHystrix implements ClientService {

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        System.out.println("断容器检测到服务不可用");
        return -9999;
    }
}
