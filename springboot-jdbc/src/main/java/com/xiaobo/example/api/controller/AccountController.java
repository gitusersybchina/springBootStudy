package com.xiaobo.example.api.controller;

import com.xiaobo.example.entity.Account;
import com.xiaobo.example.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description for this class
 *
 * @author : yinbo.shi@hand-china.com
 * @version : 1.0
 * @Name : AccountController
 * @Description : Description for this class
 * @date : 2018/10/15 18:01
 */
@RestController
@Slf4j
@RequestMapping(value = "/rest/jdbc")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping(value = "/list")
    public List<Account> getAccounts() {
        return accountService.findAllAccount();
    }

    @GetMapping(value = "/{id}")
    public Account getAccountById(@PathVariable("id") Long id) {
        return accountService.findAccountById(id);
    }

    @PutMapping(value = "/{id}")
    public String updateAccount(@PathVariable("id") Long id,
                                @RequestParam(value = "name") String name,
                                @RequestParam(value = "money") Long money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        int t = accountService.update(account);
        if (t == 1) {
            return account.toString();
        } else {
            return "fail";
        }
    }

    @PostMapping
    public String createAccount(@RequestParam(value = "name") String name,
                                @RequestParam(value = "money") Long money) {
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        int t = accountService.create(account);
        if (t == 1) {
            return account.toString();
        } else {
            return "fail";
        }

    }

    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable(value = "id") Long id) {
        int t = accountService.delete(id);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }

    }


}
