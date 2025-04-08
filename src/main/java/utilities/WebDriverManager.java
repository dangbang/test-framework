package utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager {
    private static WebDriver driver;

    static {
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
    }

    private WebDriverManager() {}
    // @SuppressWarnings("deprecation")
    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            // options.addArguments("--headless"); // Thêm tùy chọn để chạy ở chế độ headless
            // options.addArguments("--disable-gpu"); // Tắt GPU (khuyến nghị khi chạy headless)
            options.addArguments("--window-size=1920,1080"); // Đặt kích thước cửa sổ để tránh lỗi layout
            driver = new ChromeDriver(options);
            System.out.println("Driver initialized");
        } else {
            System.out.println("Driver already initialized");
        }
        if (driver == null) {
            throw new RuntimeException("Failed to initialize WebDriver");   
        }
        driver.manage().window().maximize(); // Tối ưu hóa kích thước cửa sổ
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Tối ưu hóa thời gian chờ
        // driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // Tối ưu hóa thời gian tải trang
        // driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS); // Tối ưu hóa thời gian chạy script       
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
