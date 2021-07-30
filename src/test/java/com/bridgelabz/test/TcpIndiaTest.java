package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.LoginPopUp;
import com.bridgelabz.pages.SearchPopUp;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TcpIndiaTest extends Base {
    @Severity(SeverityLevel.CRITICAL)
    @Description("Trying to login the application by handling the alert message popup")
    @Test(priority = 2)
    public void getLoginPopUp() throws InterruptedException {
        LoginPopUp loginPopUp = new LoginPopUp(driver);
        loginPopUp.setLoginButton();
    }
    @Severity(SeverityLevel.NORMAL)
    @Description("Trying to search the tracking order by handling the popup")
    @Test(priority = 1)
    public void getSearch() throws InterruptedException {
        SearchPopUp searchPopUp = new SearchPopUp(driver);
        searchPopUp.search();
    }
}

