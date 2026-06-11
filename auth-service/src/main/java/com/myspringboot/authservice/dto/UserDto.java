package com.myspringboot.authservice.dto;

import com.myspringboot.authservice.enums.Role;

import lombok.Data;

@Data
public class UserDto {
    private String id;
    private String username;
    private String password;
    private Role role;
}
