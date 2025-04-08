package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class GetUtility extends Utility {

//   public GetUtility() {
//     super();  // Gọi constructor của Utility để đảm bảo driver được gán
// }

  static WebDriver driver = getDriver();
  public static String getWindowHandle() {
    return driver.getWindowHandle();
  }

  public static Set<String> getWindowHandles() {
    return driver.getWindowHandles();
  }

  public static String getText(By locator) {
    return driver.findElement(locator).getText();
  }

  public static String getAttribute(By locator, String attribute) {
    return driver.findElement(locator).getAttribute(attribute);
  }

  public static String getURL() {
    return driver.getCurrentUrl();
  }
}
