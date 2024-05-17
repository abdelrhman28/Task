package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product {

    private final By filterZA = By.cssSelector("option[value='za']");
    private final By addProduct1 = By.id("add-to-cart-sauce-labs-bike-light");
    private final By addProduct2 = By.id("add-to-cart-sauce-labs-backpack");
    private final By filter = By.className("product_sort_container");
    private final By cartButton = By.className("shopping_cart_link");


    public void ProductPage(WebDriver drv, WebDriverWait wait) {

        try {
            //drv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            wait.until(ExpectedConditions.visibilityOfElementLocated(cartButton));
            wait.until(ExpectedConditions.elementToBeClickable(filterZA));
            drv.findElement(filterZA).click();
            wait.until(ExpectedConditions.elementToBeClickable(addProduct1));
            drv.findElement(addProduct1).click();
            wait.until(ExpectedConditions.elementToBeClickable(addProduct2));
            drv.findElement(addProduct2).click();
            wait.until(ExpectedConditions.elementToBeClickable(filter));
            drv.findElement(filter).click();
            wait.until(ExpectedConditions.elementToBeClickable(cartButton));
            drv.findElement(cartButton).click();


        } catch (Exception e) {
            System.err.println("Error occurred during login: " + e.getMessage());
            // Add further error handling as needed


        }
    }
}