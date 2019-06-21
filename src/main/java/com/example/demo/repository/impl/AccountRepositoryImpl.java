
package com.example.demo.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Account;
import com.example.demo.model.QAccount;
import com.example.demo.model.enums.AccountRole;
import com.example.demo.model.enums.Gender;
import com.example.demo.repository.AccountRepository;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;

public class AccountRepositoryImpl implements AccountRepositoryExtend {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Account> search(AccountRole role) {
        QAccount account = QAccount.account;
        BooleanBuilder builder = new BooleanBuilder();
        switch (role) {
        case USER:
            builder.and(account.gender.eq(Gender.FEMALE));
            break;
        case STAFF:
            builder.and(account.gender.eq(Gender.MALE));
            break;
        }
        builder.and(account.address.endsWith("address"));

        List<Account> result = new ArrayList<>();
        accountRepository.findAll(builder.getValue()).forEach(result::add);

        return result;
    }

    @Override
    public List<Account> searchCustom() {
        QAccount account = QAccount.account;
//        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
//        return queryFactory.selectFrom(account).where(account.email.eq("test_user_1@domain.com")).fetch();
        JPAQuery<Account> query = new JPAQuery<Account>(entityManager);
//        return query.from(account).orderBy(account.timeToHome.desc()).limit(1).fetch();
//        queryFactory.from(account).innerJoin(account).on(account.id.eq(account.id)).where(account.role.eq(AccountRole.STAFF)).fetch();
        return null;
    }

}
