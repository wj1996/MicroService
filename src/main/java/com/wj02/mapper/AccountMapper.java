package com.wj02.mapper;

import com.wj02.domain.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AccountMapper {

    public List<Account> queryAccountList();
}
