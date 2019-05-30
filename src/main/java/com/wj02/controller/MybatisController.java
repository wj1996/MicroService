package com.wj02.controller;

import com.wj02.domain.Account;
import com.wj02.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MybatisController {


    @Autowired
    private AccountMapper accountMapper;

    @RequestMapping("account")
    @ResponseBody
    public List<Account> queryUserList() {
        List<Account> list = accountMapper.queryAccountList();
        return list;
    }
}
