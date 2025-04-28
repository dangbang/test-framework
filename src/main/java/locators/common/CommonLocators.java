package locators.common;

import org.openqa.selenium.By;

public class CommonLocators {
    // Loading indicators
    public static final By LOADING_SPINNER = By.cssSelector(".loading-spinner");
    public static final By LOADING_OVERLAY = By.cssSelector(".loading-overlay");
    
    // Common buttons
    public static final By SUBMIT_BUTTON = By.cssSelector("button[type='submit']");
    public static final By CANCEL_BUTTON = By.cssSelector("button.cancel");
    
    // Common messages
    public static final By SUCCESS_MESSAGE = By.cssSelector(".alert-success");
    public static final By ERROR_MESSAGE = By.cssSelector(".alert-error");
    
    // Common modals
    public static final By MODAL_CONTAINER = By.cssSelector(".modal");
    public static final By MODAL_CLOSE_BUTTON = By.cssSelector(".modal-close");
} 