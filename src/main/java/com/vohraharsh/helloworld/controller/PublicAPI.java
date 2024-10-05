package com.vohraharsh.helloworld.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicAPI {

    @RequestMapping("/hello")
    public String HelloWorld() {
        return "Hello World";
    }

    @RequestMapping("/bye")
    public String bye() {
        return "Byeeeeee";
    }

    @RequestMapping("/hello/{name}")
    public String sayHelloToPerson(@PathVariable ("name") String name) {
        return "Hello " + name;
    }
}
