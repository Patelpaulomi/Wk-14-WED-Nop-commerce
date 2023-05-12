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
public class LoginPage extends Utility {
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement verifyWelcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement verifyLogOutLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement verifyLoginLink;

    public void verifyWelcomeText() {
        Reporter.log("Verify Text Welcome, Please Sign In!");
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = getTextFromElement(verifyWelcomeText);
        Assert.assertEquals(expectedMessage, actualMessage);
        CustomListeners.test.log(Status.PASS, "Verify Text Welcome, Please Sign In!");
    }

    public void userDetail(String email,String password)
    {
        Reporter.log("User Details");
        sendTextToElement(emailField, email);
        sendTextToElement(passwordField, password);
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"User Details");
    }

    public void getErrorMessage()
    {
        Reporter.log("Get errorMessage");
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = getTextFromElement(errorMessage);
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");
        CustomListeners.test.log(Status.PASS,"Get errorMessage");
    }

    public void verifyLogOutLink()
    {
        Reporter.log("Verify Logout Link");
        String expectedErrorMessage = "Log out";
        String actualErrorMessage = getTextFromElement(verifyLogOutLink);
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Verify Logout Link");
        CustomListeners.test.log(Status.PASS,"Verify Logout Link");
    }


    public void verifyLoginLink()
    {
        Reporter.log("Verify Login Link");
        String expectedErrorMessage = "Log in";
        String actualErrorMessage = getTextFromElement(verifyLoginLink);
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Verify Login Link");
        CustomListeners.test.log(Status.PASS,"Verify Login Link");
    }
}
