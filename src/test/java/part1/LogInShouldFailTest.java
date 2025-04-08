package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.WaitUtility;
import utilities.WebDriverManager;

public class LogInShouldFailTest {

  WebDriver driver;

  @BeforeMethod
  public void setUp() {
//    driver = new ChromeDriver();
    driver = WebDriverManager.getDriver();
    driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterClass
  public void tearDown() {
  //  driver.quit();
  }

  @Test
  public void testLoggingIntoApplication() throws InterruptedException {
    Thread.sleep(2000);
    if (driver != null) {
      WaitUtility.fluentWaitUntilVisible(driver, 5, By.className("oxd-userdropdown-tab"));
      WebElement dropdown = driver.findElement(By.className("oxd-userdropdown-tab"));
      dropdown.click();
    } else {
      System.out.println("Driver is null");
      throw new IllegalStateException("Driver is null");
    }
    WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Logout']"));
    logoutButton.click();
    // Thread.sleep(2000);
    WaitUtility.explicitWaitUntilVisible(driver, 5, By.name("username"));
    WebElement username = driver.findElement(By.name("username"));
    username.sendKeys("Admin");

    var password = driver.findElement(By.name("password"));
    password.sendKeys("admin123");

    driver.findElement(By.tagName("button")).click();

    // Thread.sleep(2000);
    String actualResult = driver.findElement(By.tagName("h6")).getText();
    String expectedResult = "Dashboard!!!";
    Assert.assertNotEquals(actualResult, expectedResult);
    System.out.println("Test 2 failed: " + actualResult.equals(expectedResult));
  }
}
