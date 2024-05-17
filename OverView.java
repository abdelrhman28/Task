package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OverView {

    private final By finishButton = By.id("finish");


    public void OverViewPage(WebDriver drv, WebDriverWait wait) {


        try {
            wait.until(ExpectedConditions.elementToBeClickable(finishButton));
            drv.findElement(finishButton).click();
        } catch (Exception e){
            System.err.println("Error occurred during login: " + e.getMessage());
            // Add further error handling as needed
        }

    }
}