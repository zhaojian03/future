package com.future.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "future-provider")
public interface ProviderFeign {

    @RequestMapping("/future/email")
    public String hello();
}
