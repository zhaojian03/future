package com.future.comtroller;

import com.future.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class futureConsumerController {
    @Autowired
    private ProviderFeign providerFeign;

    @RequestMapping("/hi")
    public String hi(){
        return providerFeign.hello();
    }

}
