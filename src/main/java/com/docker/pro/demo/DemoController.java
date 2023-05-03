package com.docker.pro.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String Message() {
        return "Welcome to openshift demo..!!";
    }

    @PostMapping("/{name}")
    public String Message(@PathVariable String name) {
        return "Your name is " + name;
    }
}
