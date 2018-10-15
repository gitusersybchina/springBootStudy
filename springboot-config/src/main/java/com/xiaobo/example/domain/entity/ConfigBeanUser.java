package com.xiaobo.example.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Description for this class
 *
 * @author : yinbo.shi@hand-china.com
 * @version : 1.0
 * @Name : ConfigBeanUser
 * @Description : Description for this class
 * @date : 2018/10/15 14:24
 */
@Configuration
@PropertySource(value = "classpath:myConfig.properties", encoding = "UTF-8")
@ConfigurationProperties(prefix = "user")
@Getter
@Setter
@ToString
@Component
public class ConfigBeanUser {

    private String ip;

    private String name;

    private String port;

    private String secret;

    private String address;

}
