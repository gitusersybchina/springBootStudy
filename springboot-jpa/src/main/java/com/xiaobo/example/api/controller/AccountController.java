package com.xiaobo.example.api.controller;

import com.xiaobo.example.entity.Account;
import com.xiaobo.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description for this class
 *
 * @author : yinbo.shi@hand-china.com
 * @version : 1.0
 * @Name : AccountController
 * @Description : Description for this class
 * @date : 2018/11/16 10:45
 */
@RestController
@RequestMapping(value = "/rest/jpa/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/list")
    public List<Account> getAccounts() {
        return accountService.queryAll();
    }

    @GetMapping(value = "/{id}")
    public Account getAccountById(@PathVariable("id") Long id) {
        return accountService.queryOne(id);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable("id") Long id,
                                                 @RequestParam(value = "name") String name,
                                                 @RequestParam(value = "money") Long money) {
        return new ResponseEntity<>(accountService.updateAccount(id, money, name), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Account> postAccount(@RequestBody Account account) {
        return new ResponseEntity<>(accountService.createAccount(account), HttpStatus.OK);
    }

}
