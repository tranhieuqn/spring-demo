
package com.example.demo.repository.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Account;
import com.example.demo.model.QAccount;
import com.example.demo.model.QStaticData;
import com.example.demo.model.enums.AccountRole;
import com.example.demo.model.enums.Gender;
import com.example.demo.repository.AccountRepository;
import com.example.demo.response.AccountResponse;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.QBean;
import com.querydsl.jpa.JPAExpressions;
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
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        return queryFactory.selectFrom(account)
                .where(account.email.endsWith("domain.com")
                       .and(account.phoneNumber.contains("1111")))
                .fetch();
////        queryFactory.from(account).innerJoin(account).on(account.id.eq(account.id)).where(account.role.eq(AccountRole.STAFF)).fetch();
    }

    @Override
    public List<AccountResponse> searchCustomResponse() {
        // custom response
        QAccount account = QAccount.account;
        QStaticData staticData = QStaticData.staticData;
        

        QBean<AccountResponse> bean = Projections.bean(AccountResponse.class,
                                                       account.email.as("email"),
                                                       account.phoneNumber.as("phoneNumber"));

        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        return queryFactory.select(bean)
                           .from(account)
                           .where(account.dob.after(LocalDate.of(1980, 10, 10))
                                  .and(account.district.in(JPAExpressions.selectFrom(staticData)
                                       .where(staticData.id.between(13, 16))))
                                  .and(JPAExpressions.selectFrom(staticData).where(staticData.id.eq(14L)).exists()))
                           .fetch();
    }

}
