package com.service.ServiceBookingSystem.DTO;

import com.service.ServiceBookingSystem.enums.UserRole;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class SignupRequestDtO {


    private Long id;

    private String email;

    private String password;

    private String name;

    private String lastname;

    private String phone;


}
