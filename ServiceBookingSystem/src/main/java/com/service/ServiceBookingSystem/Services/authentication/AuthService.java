package com.service.ServiceBookingSystem.Services.authentication;

import com.service.ServiceBookingSystem.DTO.SignupRequestDtO;
import com.service.ServiceBookingSystem.DTO.UserDto;

public interface AuthService {

    public UserDto signupClient(SignupRequestDtO signupRequestDtO);
}
