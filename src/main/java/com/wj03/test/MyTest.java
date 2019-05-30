package com.wj03.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wj03.MySpringBootApplication;
import com.wj03.domain.Account;
import com.wj03.repository.AccountRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * springboot集成Junit测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class MyTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void test1() {
        List<Account> list = accountRepository.findAll();
        System.out.println(list);
    }


    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void testRedis() throws JsonProcessingException {
        String str = redisTemplate.boundValueOps("user.findAll").get();
        if (null == str) {
            List<Account> list = accountRepository.findAll();
            //jackson处理json
            ObjectMapper objectMapper = new ObjectMapper();
            str = objectMapper.writeValueAsString(list);
            redisTemplate.boundValueOps("user.findAll").set(str);

            System.out.println("---------------------从数据库");
        } else {
            System.out.println("从缓存中查询");
        }
        System.out.println(str);
    }
}
