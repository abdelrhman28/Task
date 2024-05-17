package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOut {


    private final By firstnameField = By.id("first-name");
    private final By lastnameField = By.id("last-name");
    private final By postalCodeField = By.id("postal-code");
    private final By continueButton = By.id("continue");


    String firstName = "Abdelrhman";
    String lastName = "Saad";
    String postalCode = "19991";
//

    public void CheckOutPage(WebDriver drv, WebDriverWait wait) {

        try {
            wait.until(ExpectedConditions.elementToBeClickable(firstnameField));
            drv.findElement(firstnameField).sendKeys(firstName);
            wait.until(ExpectedConditions.elementToBeClickable(lastnameField));
            drv.findElement(lastnameField).sendKeys(lastName);
            wait.until(ExpectedConditions.elementToBeClickable(postalCodeField));
            drv.findElement(postalCodeField).sendKeys(postalCode);
            wait.until(ExpectedConditions.elementToBeClickable(continueButton));
            drv.findElement(continueButton).click();
        } catch (Exception e){
            System.err.println("Error occurred during login: " + e.getMessage());
            // Add further error handling as needed
        }


    }
}
