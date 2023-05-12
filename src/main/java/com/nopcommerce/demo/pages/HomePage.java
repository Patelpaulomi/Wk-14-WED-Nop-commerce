package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class HomePage extends Utility {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersTab;

    public void clickOnLoginLink() {
        Reporter.log("Click On Login Link" + loginLink.toString());
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS, "Click On Login Link");
    }

    public void clickOnRegisterLink() {
        Reporter.log("Click OnRegister Link" + registerLink.toString());
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "Click On Register Link");
    }

    public void clickOnLogOutLink() {
        Reporter.log("Click On LogOut Link" + logOutLink.toString());
        clickOnElement(logOutLink);
        CustomListeners.test.log(Status.PASS, "Click On LogOut Link");
    }

    public void clickOnComputerTab() {
        Reporter.log("Click on Computer Tab");
        clickOnElement(computersTab);
        CustomListeners.test.log(Status.PASS, "Click on Computer Tab");
    }
}
