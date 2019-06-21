package com.example.demo.startup;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.demo.model.Account;
import com.example.demo.model.enums.AccountRole;
import com.example.demo.model.enums.Gender;
import com.example.demo.model.enums.Transport;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.StaticDataRepository;


@Component
@Transactional
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private StaticDataRepository staticDataRepository;

    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
        try {
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() throws Exception {
        initAccounts();
    }

    public void initAccounts() {
        LocalDateTime now = LocalDateTime.now();
        Account account = new Account();
        account.setEmail("test_user_1@domain.com");
        account.setPassword(passwordEncoder.encode("test_user_1_password"));
        account.setRole(AccountRole.USER);
        account.setPhoneNumber("07011111111");
        account.setFirstName("test_user_1_first_name");
        account.setLastName("test_user_1_last_name");
        account.setFirebaseUID("test_user_1_firebaseUID");
        account.setGender(Gender.FEMALE);
        account.setDob(LocalDate.now().minusYears(40));
        account.setAddress("test_user_1 address");
        account.setDistrict(staticDataRepository.findById(19L).get());
        account.setPostalCode("333-3333");
        account.setPlaceNearBy("test_user_1 place near by");
        account.setMetroNearBy(staticDataRepository.findById(53L).get());
        account.setTimeToHome(30L);
        account.setTransport(Transport.SUBWAY);
        account.setCreatedAt(now);
        account.setUpdatedAt(now);
        accountRepository.save(account);

        now = LocalDateTime.now();
        account = new Account();
        account.setEmail("test_user_2@domain.com");
        account.setPassword(passwordEncoder.encode("test_user_2_password"));
        account.setRole(AccountRole.USER);
        account.setPhoneNumber("07022222222");
        account.setFirstName("test_user_2_first_name");
        account.setLastName("test_user_2_last_name");
        account.setFirebaseUID("test_user_2_firebaseUID");
        account.setGender(Gender.MALE);
        account.setDob(LocalDate.now().minusYears(45));
        account.setAddress("test_staff_2 address");
        account.setDistrict(staticDataRepository.findById(16L).get());
        account.setPostalCode("333-3333");
        account.setPlaceNearBy("test_staff_1 place near by");
        account.setMetroNearBy(staticDataRepository.findById(52L).get());
        account.setTimeToHome(25L);
        account.setTransport(Transport.SUBWAY);
        account.setCreatedAt(now);
        account.setUpdatedAt(now);
        accountRepository.save(account);

        now = LocalDateTime.now();
        account = new Account();
        account.setEmail("test_staff_1@domain.com");
        account.setPassword(passwordEncoder.encode("test_staff_1_password"));
        account.setRole(AccountRole.STAFF);
        account.setPhoneNumber("07033333333");
        account.setFirstName("test_staff_1_first_name");
        account.setLastName("test_staff_1_last_name");
        account.setFirebaseUID("test_staff_1_firebaseUID");
        account.setGender(Gender.FEMALE);
        account.setDob(LocalDate.now().minusYears(30));
        account.setAddress("test_staff_1 address");
        account.setDistrict(staticDataRepository.findById(19L).get());
        account.setPostalCode("333-3333");
        account.setPlaceNearBy("test_staff_1 place near by");
        account.setMetroNearBy(staticDataRepository.findById(52L).get());
        account.setTimeToHome(30L);
        account.setTransport(Transport.SUBWAY);
        account.setCreatedAt(now);
        account.setUpdatedAt(now);
        accountRepository.save(account);

        now = LocalDateTime.now();
        account = new Account();
        account.setEmail("test_staff_2@domain.com");
        account.setPassword(passwordEncoder.encode("test_staff_2_password"));
        account.setRole(AccountRole.STAFF);
        account.setPhoneNumber("07044444444");
        account.setFirstName("test_staff_2_first_name");
        account.setLastName("test_staff_2_last_name");
        account.setFirebaseUID("test_staff_2_firebaseUID");
        account.setGender(Gender.MALE);
        account.setDob(LocalDate.now().minusYears(35));
        account.setAddress("test_staff_2 address");
        account.setDistrict(staticDataRepository.findById(16L).get());
        account.setPostalCode("333-3333");
        account.setPlaceNearBy("test_staff_1 place near by");
        account.setMetroNearBy(staticDataRepository.findById(53L).get());
        account.setTimeToHome(40L);
        account.setTransport(Transport.SUBWAY);
        account.setCreatedAt(now);
        account.setUpdatedAt(now);
        accountRepository.save(account);
    }

}
