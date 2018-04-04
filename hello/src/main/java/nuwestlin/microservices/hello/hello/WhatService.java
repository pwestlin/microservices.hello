package nuwestlin.microservices.hello.hello;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="${whatservice.name}")
//@RibbonClient(name="${whatservice.name}")
public interface WhatService {

    @GetMapping("/what")
    String what();
}
