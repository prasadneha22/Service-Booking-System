package com.service.ServiceBookingSystem.Services.authentication;

import com.service.ServiceBookingSystem.DTO.SignupRequestDtO;
import com.service.ServiceBookingSystem.DTO.UserDto;
import com.service.ServiceBookingSystem.Entity.User;
import com.service.ServiceBookingSystem.Repository.UserRepository;
import com.service.ServiceBookingSystem.enums.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

    @Autowired
    private UserRepository userRepository;

    public UserDto signupClient(SignupRequestDtO signupRequestDtO){
        User user = new User();

        user.setName(signupRequestDtO.getName());
        user.setLastname(signupRequestDtO.getLastname());
        user.setEmail(signupRequestDtO.getEmail());
        user.setPhone(signupRequestDtO.getPhone());
        user.setPassword(signupRequestDtO.getPassword());

        user.setRole(UserRole.CLIENT);

        return userRepository.save(user).getDto();


    }


}
