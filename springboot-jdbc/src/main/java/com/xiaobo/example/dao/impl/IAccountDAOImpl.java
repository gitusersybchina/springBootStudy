package com.xiaobo.example.dao.impl;

import com.xiaobo.example.dao.AccountDAO;
import com.xiaobo.example.entity.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Description for this class
 *
 * @author : yinbo.shi@hand-china.com
 * @version : 1.0
 * @Name : IAccountDAOImpl
 * @Description : Description for this class
 * @date : 2018/10/15 17:47
 */
@Component
@Slf4j
public class IAccountDAOImpl implements AccountDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Account account) {
        return jdbcTemplate.update("insert into account(name, money) values(?, ?)",
                account.getName(), account.getMoney());

    }

    @Override
    public int update(Account account) {
        return jdbcTemplate.update("UPDATE  account SET NAME=? ,money=? WHERE id=?",
                account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public int delete(Long id) {

        return jdbcTemplate.update("DELETE from TABLE account where id=?", id);
    }

    @Override
    public Account findAccountById(Long id) {

        List<Account> list = jdbcTemplate.query("select * from account where id = ?", new Object[]{id}, new BeanPropertyRowMapper(Account.class));
        if (list != null && list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<Account> findAllAccount() {

        List<Account> list = jdbcTemplate.query("select * from account", new Object[]{}, new BeanPropertyRowMapper(Account.class));
        if (list != null && list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
