package com.xiaobo.example.dao;

import com.xiaobo.example.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description for this class
 *
 * @author : yinbo.shi@hand-china.com
 * @version : 1.0
 * @Name : AccountDAO
 * @Description : Description for this class
 * @date : 2018/10/18 10:23
 */
public interface AccountDAO extends JpaRepository<Account, Long> {

}
