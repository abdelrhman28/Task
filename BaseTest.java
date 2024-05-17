package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
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
    @BeforeTest

    public void BaseTest(){
        drv1 = DriverManager.getDriver();
    }

    @Test
    public void Tester1() {
        testLoginPage.loginPage("standard_user","secret_sauce", drv1, wait);
        testProduct.ProductPage(drv1, wait);
        testCart.CartPage(drv1, wait);
        testCheckOut.CheckOutPage(drv1, wait);
        testOverView.OverViewPage(drv1, wait);

    }

    @BeforeMethod
    public void Link(){

        drv1.get(DriverManager.BROWSER_LINK);
    }

    @Test
    public void Tester2() {
        System.out.println(drv1.getCurrentUrl());
        testLoginPage.loginPage("visual_user", "secret_sauce", drv1, wait);
        testProduct.ProductPage(drv1, wait);
        testCart.CartPage(drv1, wait);
        testCheckOut.CheckOutPage(drv1, wait);
        testOverView.OverViewPage(drv1, wait);


        DriverManager.quitDriver();
        // Close WebDriver instance after test
    }
    @AfterTest
    public void quitDriver(){
        drv1.quit();

    }

    // Ensure that WebDriver instances are properly closed after each test method

}
