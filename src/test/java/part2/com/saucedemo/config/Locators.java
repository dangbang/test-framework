package part2.com.saucedemo.config;

import org.openqa.selenium.By;

public class Locators {
    // Login Page Locators
    public static final By USERNAME_INPUT = By.id("user-name");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("login-button");
    public static final By ERROR_MESSAGE = By.cssSelector("[data-test='error']");
    
    // Add more locators here as needed
} 