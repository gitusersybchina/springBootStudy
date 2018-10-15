package com.xiaobo.example.api.controller;

import com.xiaobo.example.domain.entity.ConfigBeanPerson;
import com.xiaobo.example.domain.entity.ConfigBeanUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description for this class
 *
 * @author : yinbo.shi@hand-china.com
 * @version : 1.0
 * @Name : ConfigBeanController
 * @Description : Description for this class
 * @date : 2018/10/15 10:39
 */
@RestController
@RequestMapping(value = "/rest/config")
public class ConfigBeanController {

    @Autowired
    ConfigBeanPerson person;

    @RequestMapping(value = "/person")
    public String configPerson() {

        return person.getGreeting()
                + " >>>>" + person.getName()
                + " >>>>" + person.getUuid()
                + " >>>>" + person.getMax();
    }

    @Autowired
    ConfigBeanUser user;

    @RequestMapping(value = "/user")
    public String myConfigUser() {
        return user.toString();
    }

}
