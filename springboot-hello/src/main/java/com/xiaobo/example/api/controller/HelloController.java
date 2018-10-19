package com.xiaobo.example.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description for this class
 *
 * @author : yinbo.shi
 * @version : 1.0
 * @Name : HelloController
 * @Description : Description for this class
 * @date : 2018/10/9 11:42
 */
@RestController
@RequestMapping(value = "/rest/first")
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayHello() {

        return "Greetings from Spring Boot!";
    }

}
