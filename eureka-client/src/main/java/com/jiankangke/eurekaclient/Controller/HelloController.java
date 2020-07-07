package com.jiankangke.eurekaclient.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("sayHello")
    public String sayHello() throws Exception {
        Integer i = null;
        i.toString();
        return "aaa";
    }

}
