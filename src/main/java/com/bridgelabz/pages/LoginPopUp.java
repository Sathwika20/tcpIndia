package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPopUp extends Base {
    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[8]")
    WebElement loginButton;

    @FindBy(xpath = "//input[@id = 'txt_uid']")
    WebElement login;

    @FindBy(xpath = "//input[@id = 'txt_pwd']")
    WebElement password;

    @FindBy(xpath = "//button[@id = 'btnLogin']")
    WebElement signIn;

    public LoginPopUp(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    /**This method is designed to login the page through valid credentials and handle the alert message popup
     *
     * @throws InterruptedException
     */
    public void setLoginButton() throws InterruptedException {
        loginButton.click();
        Thread.sleep(2000);
        login.sendKeys("sathwika@20");
        password.sendKeys("ABCdef123");
        Thread.sleep(2000);
        signIn.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        Thread.sleep(3000);
        alert.accept();
        Assert.assertEquals(alertMessage,"Authentication Failed, Please use registered mobile recieved password.");
    }
}
