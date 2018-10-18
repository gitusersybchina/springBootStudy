package com.xiaobo.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description for this class
 *
 * @author : yinbo.shi@hand-china.com
 * @version : 1.0
 * @Name : Account
 * @Description : Description for this class
 * @date : 2018/10/15 17:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {


    private Long id;

    private String name;

    private Long money;

}
