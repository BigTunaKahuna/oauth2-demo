package com.demo_security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping
    public String hello() {
        var foo = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(foo.toString());
        return "hello";
    }
}
