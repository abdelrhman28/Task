package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {

    WebDriver drv = DriverManager.getDriver();

    private final By removeItem = By.id("remove-sauce-labs-bike-light");
    private final By checkoutButton = By.id("checkout");

    public void CartPage(WebDriver drv, WebDriverWait wait) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(removeItem));
            drv.findElement(removeItem).click();
            wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
            drv.findElement(checkoutButton).click();
        } catch (Exception e){
            System.err.println("Error occurred during login: " + e.getMessage());
            // Add further error handling as needed
        }


    }

}
