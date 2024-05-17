package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");

    public void loginPage(String username, String password, WebDriver driver, WebDriverWait wait) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(usernameField));
            driver.findElement(usernameField).sendKeys(username);
            wait.until(ExpectedConditions.elementToBeClickable(passwordField));
            driver.findElement(passwordField).sendKeys(password);
            wait.until(ExpectedConditions.elementToBeClickable(loginButton));
            driver.findElement(loginButton).click();
        } catch (Exception e) {
            System.err.println("Error occurred during login: " + e.getMessage());
            // Add further error handling as needed
        }
    }
}
