package com.farmbridge.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    private String contact;
    private String password;
}
