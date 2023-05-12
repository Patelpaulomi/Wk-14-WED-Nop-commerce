package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class ComputerPage extends Utility {
    public ComputerPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computersText;

    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopsLink;

    public void verifyComputersText(){
        Reporter.log("Verify Computers Text");
        String expectedMessage = "Computers";
        String actualMessage = getTextFromElement(computersText);
        Assert.assertEquals(expectedMessage, actualMessage);
        CustomListeners.test.log(Status.PASS, "Verify Computers Text");
    }

    public void clickOnDesktopsLink() {
        Reporter.log("Click on Desktops Link");
        clickOnElement(desktopsLink);
        CustomListeners.test.log(Status.PASS, "Click on Desktops Link");
    }

}
