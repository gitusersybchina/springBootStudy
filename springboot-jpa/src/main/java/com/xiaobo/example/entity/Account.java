package com.xiaobo.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Description for this class
 *
 * @author : yinbo.shi@hand-china.com
 * @version : 1.0
 * @Name : Account
 * @Description : Description for this class
 * @date : 2018/10/18 10:22
 */
@Entity
@Data
public class Account {

    @Id
    @GeneratedValue
    private Long id ;
    private String name ;
    private Long money;
}
