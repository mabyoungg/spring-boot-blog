package com.sparta.spartablog.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignRequestDto {
    private String username;
    private String password;
    private String email;
}