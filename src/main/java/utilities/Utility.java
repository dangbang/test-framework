package utilities;

import com.base.BasePage;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
  protected static WebDriver getDriver() {
    return WebDriverManager.getDriver();
  }
    public static WebElement waitForVisible(WebDriver driver, By locator, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

  // public static WebDriver driver;

  // public static void setUtilityDriver() {
  //   driver = BasePage.driver;
  // }

  // Generate A Random Number

  // Return Strings To UpperCase
}
