package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.*;

public class BaseTest {

    // Separate WebDriver instances for each test method
    WebDriver drv1;


    LoginPage testLoginPage = new LoginPage();
    Cart testCart = new Cart();
    Product testProduct = new Product();
    CheckOut testCheckOut = new CheckOut();
    OverView testOverView = new OverView();

    // WebDriverWait instance for waiting for elements

    WebDriverWait wait = new WebDriverWait(drv1, 10);


    @Test
    public void Tester1() {
        //DriverManager.getDriver();
        testLoginPage.loginPage("standard_user","secret_sauce", drv1, wait);
        testProduct.ProductPage(drv1, wait);
        testCart.CartPage(drv1, wait);
        testCheckOut.CheckOutPage(drv1, wait);
        testOverView.OverViewPage(drv1, wait);
        //drv1.switchTo();
    }



    @Test
    public void Tester2() {
        //DriverManager.getDriver();
        drv1.get(DriverManager.BROWSER_LINK);
        System.out.println(drv1.getCurrentUrl());
        testLoginPage.loginPage("visual_user", "secret_sauce", drv1, wait);
        testProduct.ProductPage(drv1, wait);
        testCart.CartPage(drv1, wait);
        testCheckOut.CheckOutPage(drv1, wait);
        testOverView.OverViewPage(drv1, wait);
        drv1.quit();

        DriverManager.quitDriver();
        // Close WebDriver instance after test
    }

    // Ensure that WebDriver instances are properly closed after each test method

}
