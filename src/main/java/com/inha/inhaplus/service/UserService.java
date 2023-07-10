package com.inha.inhaplus.service;

import com.inha.inhaplus.entity.User;
import com.inha.inhaplus.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getUserService(long id, String email) {

        // 기본형(Primitive Type) 변수의 값이 없을 땐 null이 아님
        if(id == 0L && email.isBlank()) {
            return userRepository.findAll();
        } else if(id != 0L) {
            return userRepository.findUserPasswordById(id);
        } else if(!email.isBlank()) {
            return userRepository.findUserPasswordByEmail(email);
        } else {
            return userRepository.findUserPasswordByIdAndEmail(id, email);
        }
    }

    public String createUserService(User user) {
        userRepository.save(user);
        return "회원가입 완료";
    }
}
