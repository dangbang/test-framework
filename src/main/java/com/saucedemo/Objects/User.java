package com.saucedemo.Objects;

import java.util.List;


public class User {
    private String userId;
    private String userName;
    private String password;
    private String email;
    private String status;
    private List<Order> orders;

    public User(String userId, String name, String password, String email, String status){
        this.userId = userId;
        this.userName = name;
        this.password = password;
        this.email = email;
        this.status = status;
    }

    public boolean login(AuthService authService, String email, String password) {
        return authService.authenticate(email, password);
    }
    public String checkStatus() {
        return this.status;
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}
