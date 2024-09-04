package com.example.RestfulAndExceptionHandling.repo;

import org.springframework.stereotype.Repository;

import com.example.RestfulAndExceptionHandling.model.AccountEntity;

@Repository
public interface AccountRepo extends BaseRepo<AccountEntity,Integer>{

}
