package com.saucedemo.Objects;
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AuthService {
    public boolean authenticate(String user, String password) {
        // Simulate authentication
        // ObjectMapper mapper = new ObjectMapper();
        // DemoData data = mapper.readValue(new File("data/users.json"), null);
        // return users.containsKey(user) && users.get(user).equals(password);
        return true;
    }
}
