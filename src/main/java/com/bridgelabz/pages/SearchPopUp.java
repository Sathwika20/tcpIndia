package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchPopUp extends Base {
    @FindBy(xpath = "//input[@class = 'form-control']")
    WebElement search;

    @FindBy(xpath = "//button[@class = 'btn btn-redTheme']")
    WebElement searchButton;

    public SearchPopUp(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void search() throws InterruptedException {
        search.sendKeys("1345678");
        Thread.sleep(2000);
        searchButton.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        Thread.sleep(3000);
        alert.accept();
        Assert.assertEquals(alertMessage,"Dear Patrons, Please enter number between 1 to 9 after three alphabets origin without space");
    }
}
