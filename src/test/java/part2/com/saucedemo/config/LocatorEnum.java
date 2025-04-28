package part2.com.saucedemo.config;

import org.openqa.selenium.By;

public enum LocatorEnum {
    // Login page locators
    USERNAME_INPUT(By.id("user-name"), "Username input field"),
    PASSWORD_INPUT(By.id("password"), "Password input field"),
    LOGIN_BUTTON(By.id("login-button"), "Login button"),
    ERROR_MESSAGE(By.cssSelector("[data-test='error']"), "Error message container");
    
    private final By locator;
    private final String description;
    
    LocatorEnum(By locator, String description) {
        this.locator = locator;
        this.description = description;
    }
    
    public By getLocator() {
        return locator;
    }
    
    public String getDescription() {
        return description;
    }
} 