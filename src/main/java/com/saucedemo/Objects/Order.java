package com.saucedemo.Objects;

import java.util.Date;

public class Order {
    private String orderId;
    private String userId;
    private Date orderDate;
    private String status;

    public Order(String orderId, String userId, Date orderDate, String status) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderDate = orderDate;
        this.status = status;
    }

    public String getOrderStatus() {
        return this.status;
    }

}
