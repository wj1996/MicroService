package com.wj02.test;

import com.wj02.MySpringBootApplication;
import com.wj02.domain.Account;
import com.wj02.mapper.AccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * springboot集成Junit测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class MyTest {


    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void test() {
        List<Account> accounts = accountMapper.queryAccountList();
        System.out.println(accounts);
    }
}
