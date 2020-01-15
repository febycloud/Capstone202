package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hellocontrol {


    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
