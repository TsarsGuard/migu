package com.didispace;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi {

    @RequestMapping("/hi")
    public String index() {
        return "hi";
    }

}