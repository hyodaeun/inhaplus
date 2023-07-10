package com.inha.inhaplus;

import com.inha.inhaplus.entity.User;
import com.inha.inhaplus.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class InhaplusApplicationTests {

    UserRepository userRepository;

    @BeforeEach
    void insertTestData() {
        User user = new User();
        user.setId(12233779);
        user.setPassword("test1234");
        user.setEmail("he.jung@inha.edu");
        userRepository.save(user);
    }

    @Test
    void findAllTest() {
        List<User> userList = userRepository.findUserPasswordByIdAndEmail(12233779, "he.jung@inha.edu");
        for(User userObj : userList) log.info("Find PW :: " + userObj.getPassword());
    }

    @Test
    void contextLoads() {
    }

}
