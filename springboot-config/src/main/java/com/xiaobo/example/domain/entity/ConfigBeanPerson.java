package com.xiaobo.example.domain.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Description for this class
 *
 * @author : yinbo.shi@hand-china.com
 * @version : 1.0
 * @Name : ConfigPerson
 * @Description : Description for this class
 * @date : 2018/10/15 11:13
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "bean.person")
@Component
public class ConfigBeanPerson {

    private String name;
    private int age;
    private int number;
    private String uuid;
    private int max;
    private String value;
    private String greeting;
}
