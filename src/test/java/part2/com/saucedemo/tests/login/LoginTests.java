package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;
import part2.com.saucedemo.config.DataPool;
import part2.com.saucedemo.config.TestDataEnum;
import utilities.PerformanceUtil;

public class LoginTests extends BaseTest {

  @Test
  public void testLoginErrorMessage() {
    // Using DataPool for user credentials
    String username = DataPool.getUserDataValue("STANDARD_USER", "username");
    String invalidPassword = TestDataEnum.INVALID_PASSWORD.getValue();
    
    loginPage.setUsername(username);
    loginPage.setPassword(invalidPassword);
    loginPage.clickLoginButton();
    
    double loadPageTime = PerformanceUtil.getNavigationTiming(driver);
    String actualMessage = loginPage.getErrorMessage();
    
    // Using TestDataEnum for error message
    Assert.assertEquals(actualMessage, TestDataEnum.LOGIN_ERROR_MESSAGE.getValue(), 
        "Error message does not match");
    
    // Using TestDataEnum for performance threshold
    Assert.assertTrue(loadPageTime < TestDataEnum.MAX_PAGE_LOAD_TIME.getDoubleValue(), 
        "Page load time is too long: " + loadPageTime + " seconds");
    
    System.out.println("Test 3 passed: " + actualMessage.contains("Epic sadface"));
    System.out.println("Test 3 passed: " + "Page load time is : " + loadPageTime + " seconds");
  }
}
