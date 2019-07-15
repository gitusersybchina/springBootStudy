package com.xiaobo.example.service.impl;

import com.xiaobo.example.dao.AccountDAO;
import com.xiaobo.example.entity.Account;
import com.xiaobo.example.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Description for this class
 *
 * @author : yinbo.shi@hand-china.com
 * @version : 1.0
 * @Name : AccountServiceImpl
 * @Description : Description for this class
 * @date : 2018/11/19 9:55
 */
@Service
public class AccountServiceImpl implements AccountService {

    private AccountDAO accountDAO;

    public AccountServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public List<Account> queryAll() {
        return accountDAO.findAll();
    }

    @Override
    public Account queryOne(@NotNull Long id) {
        return accountDAO.getOne(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Account updateAccount(@NotNull Long id,
                                 @NotNull Long money,
                                 @NotBlank String name) {
        return accountDAO.save(Account.builder()
                .id(id)
                .money(money)
                .name(name)
                .build());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Account createAccount(Account account) {
        return accountDAO.save(account);
    }
}
