package com.victorgomez.spingboot.webapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("victorgomez");
        boolean isValidPassword = password.equalsIgnoreCase("12345");

        return isValidUserName && isValidPassword;
    }
}
