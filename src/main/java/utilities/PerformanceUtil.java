package utilities;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PerformanceUtil {
    public static double measurePageLoadTime(WebDriver driver, String url) {
        Instant start = Instant.now();
        driver.get(url);
        Instant end = Instant.now();
        long loadTime = end.toEpochMilli() - start.toEpochMilli();  

        return loadTime / 1000.0; 
    }
    public static double getNavigationTiming(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long loadTime = (Long) js.executeScript(
            "return window.performance.timing.loadEventEnd - window.performance.timing.navigationStart;"
            );
        return loadTime / 1000.0; 
    }

    public static void waitForPageLoad(WebDriver driver) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
            webDriver -> ((JavascriptExecutor) webDriver)
            .executeScript("return document.readyState").equals("complete"));
    }
}
