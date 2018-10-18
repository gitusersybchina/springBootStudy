package com.xiaobo.example.dao;

import com.xiaobo.example.entity.Account;

import java.util.List;

/**
 * Description for this class
 *
 * @author : yinbo.shi@hand-china.com
 * @version : 1.0
 * @Name : AccountDAO
 * @Description : Description for this class
 * @date : 2018/10/15 17:34
 */
public interface AccountDAO {

    /**
     *
     * @param account Account
     * @return int
     */
    int create(Account account);

    /**
     *
     * @param account Account
     * @return int
     */
    int update(Account account);

    /**
     *
     * @param id accountId
     * @return int
     */
    int delete(Long id);

    /**
     *
     * @param id accountId
     * @return Account
     */
    Account findAccountById(Long id);

    /**
     *
     * @return Account
     */
    List<Account> findAllAccount();
}
