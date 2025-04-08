package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;
import utilities.PerformanceUtil;

public class LoginTests extends BaseTest {

  @Test
  public void testLoginErrorMessage() {
    loginPage.setUsername("standard_user");
    loginPage.setPassword("xyz3400");
    loginPage.clickLoginButton();
    // PerformanceUtil.waitForPageLoad(driver);
    double loadPageTime = PerformanceUtil.getNavigationTiming(driver);
    String actualMessage = loginPage.getErrorMessage();
    Assert.assertTrue(actualMessage.contains("Epic sadface"));
    Assert.assertTrue(loadPageTime < 3.0, "Page load time is too long: " + loadPageTime + " seconds");
    System.out.println("Test 3 passed: " + actualMessage.contains("Epic sadface"));
    System.out.println("Test 3 passed: " + "Page load time is : " + loadPageTime + " seconds");
  }
}
