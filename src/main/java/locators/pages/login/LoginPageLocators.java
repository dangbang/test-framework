package locators.pages.login;

import org.openqa.selenium.By;

public class LoginPageLocators {
    // Form elements
    public static final By USERNAME_FIELD = By.id("username");
    public static final By PASSWORD_FIELD = By.id("password");
    public static final By LOGIN_BUTTON = By.cssSelector("button.login-btn");
    
    // Validation messages
    public static final By USERNAME_ERROR = By.cssSelector(".username-error");
    public static final By PASSWORD_ERROR = By.cssSelector(".password-error");
    
    // Remember me section
    public static final By REMEMBER_ME_CHECKBOX = By.id("remember-me");
    public static final By FORGOT_PASSWORD_LINK = By.cssSelector(".forgot-password");
} 