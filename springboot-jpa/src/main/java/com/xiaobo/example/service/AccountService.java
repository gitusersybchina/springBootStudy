package com.xiaobo.example.service;

import com.xiaobo.example.entity.Account;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Description for this class
 *
 * @author : yinbo.shi@hand-china.com
 * @version : 1.0
 * @Name : AccountService
 * @Description : Description for this class
 * @date : 2018/11/19 9:54
 */
public interface AccountService {

    List<Account> queryAll();

    Account queryOne(@NotNull Long id);

    Account updateAccount(@NotNull Long id,
                          @NotNull Long money,
                          @NotBlank String name);

    Account createAccount(Account account);
}
