package com.xiaobo.example.service.impl;

import com.xiaobo.example.dao.AccountDAO;
import com.xiaobo.example.entity.Account;
import com.xiaobo.example.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Description for this class
 *
 * @author : yinbo.shi@hand-china.com
 * @version : 1.0
 * @Name : IAccountServiceImpl
 * @Description : Description for this class
 * @date : 2018/10/15 17:54
 */
@Component
@Slf4j
public class IAccountServiceImpl implements AccountService {

    @Autowired
    AccountDAO accountDAO;

    @Override
    public int create(Account account) {
        return accountDAO.create(account);
    }

    @Override
    public int update(Account account) {
        return accountDAO.update(account);
    }

    @Override
    public int delete(Long id) {
        return accountDAO.delete(id);
    }

    @Override
    public Account findAccountById(Long id) {
        return accountDAO.findAccountById(id);
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDAO.findAllAccount();
    }
}
