package com.localbizdirectory.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO {
    private String username;
    private String password;
    private String forename;
    private String surname;
}
