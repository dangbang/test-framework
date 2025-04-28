package locators.components.header;

import org.openqa.selenium.By;

public class HeaderLocators {
    // Main navigation
    public static final By MAIN_MENU = By.cssSelector(".main-menu");
    public static final By HOME_LINK = By.cssSelector(".menu-item.home");
    public static final By PRODUCTS_LINK = By.cssSelector(".menu-item.products");
    public static final By ABOUT_LINK = By.cssSelector(".menu-item.about");
    
    // User section
    public static final By USER_MENU = By.cssSelector(".user-menu");
    public static final By PROFILE_LINK = By.cssSelector(".user-menu .profile");
    public static final By SETTINGS_LINK = By.cssSelector(".user-menu .settings");
    public static final By LOGOUT_BUTTON = By.cssSelector(".user-menu .logout");
    
    // Search
    public static final By SEARCH_BOX = By.cssSelector(".search-box");
    public static final By SEARCH_BUTTON = By.cssSelector(".search-button");
} 