package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hellocontrol {


    @RequestMapping("/hello")
    public String index() {
        return "Hello\n" +
                " World";
    }

    @RequestMapping("/hfa")
    public String index2() {
        return "fa\n" +
                " World";
    }
}
