package com.backend.backend.dto;

import java.util.List;

import com.backend.backend.entity.Users;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqRes {

    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationToken;
    private String expirationTime;
    private String name;
    private String password;
    private String email;
    private String role;
    private String city;
    private Users users;
    private List<Users> usersList;

}
