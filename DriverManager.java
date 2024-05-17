package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;
    private static final String DRIVER_FILE = "webdriver.chrome.driver";
    private static final String DRIVER_PATH = "/Users/Abdelrahman/Desktop/Task/Test/src/main/resources/chromedriver";
    public static final String BROWSER_LINK = "https://www.saucedemo.com/";

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty(DRIVER_FILE, DRIVER_PATH);
            try {
                driver = new ChromeDriver();
            } catch (Exception e) {
                System.err.println("Failed to initialize WebDriver: " + e.getMessage());
                throw new RuntimeException("Failed to initialize WebDriver", e);
            }
            driver.get(BROWSER_LINK);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Reset the WebDriver instance
        }

    }
    public static void CloseDriver() {
        if (driver != null) {
            driver.close();
            driver = null; // Reset the WebDriver instance
        }

    }
}
