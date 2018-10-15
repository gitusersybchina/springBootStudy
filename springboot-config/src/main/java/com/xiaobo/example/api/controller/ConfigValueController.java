package com.xiaobo.example.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description for this class
 *
 * @author : yinbo.shi@hand-china.com
 * @version : 1.0
 * @Name : ConfigValueController
 * @Description : Description for this class
 * @date : 2018/10/15 9:32
 */
@RestController
@RequestMapping("/rest/config")
public class ConfigValueController {


    @Value("${configValue.name}")
    private String name;
    @Value("${configValue.age}")
    private int age;
    @Value("${configValue.sex}")
    private String sex;

    @GetMapping(value = "/configValue")
    public String configValue() {

        return ">>>>>>name:" + name
                + ">>>>>age:" + age
                + ">>>>>sex:" + sex;
    }

}
