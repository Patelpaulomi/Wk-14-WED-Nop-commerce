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
public class RegisterPage extends Utility {
    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(.,'Register')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//span[@data-valmsg-for='FirstName']")
    WebElement firstNameError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordError;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement gender;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement birthDay;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement birthMonth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement birthYear;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement RegisterButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registerCompleteText;

    public void clickOnRegisterLink() {
        Reporter.log("Click On Register Link");
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "Click On Register Link");
    }

    public String verifyRegisterText() {
        Reporter.log("Get Register Link");
        String expectedRegisterText = "Register";
        String actualRegisterText = getTextFromElement(registerText);
        CustomListeners.test.log(Status.PASS, "Get Register Link");
        return actualRegisterText;
    }

    public void clickOnRegisterButton() {
        Reporter.log("Click On Register Button");
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS, "Click On Register Button");
    }

    public void verifyFirstNameError() {
        Reporter.log("First name is required.");
        String expectedFirstNameError = "First name is required.";
        String actualFirstNameError = getTextFromElement(firstNameError);
        Assert.assertEquals(expectedFirstNameError, actualFirstNameError);
        CustomListeners.test.log(Status.PASS, "First name is required.");
    }

    public void verifyLastNameError() {
        Reporter.log("Last name is required.");
        String expectedLastNameError = "Last name is required.";
        String actualLastNameError = getTextFromElement(lastNameError);
        Assert.assertEquals(expectedLastNameError, actualLastNameError);
        CustomListeners.test.log(Status.PASS, "Last name is required.");
    }

    public void verifyEmailError() {
        Reporter.log("Email is required.");
        String expectedEmailError = "Email is required.";
        String actualEmailError = getTextFromElement(emailError);
        Assert.assertEquals(expectedEmailError, actualEmailError);
        CustomListeners.test.log(Status.PASS, "Email is required.");
    }

    public void verifyPasswordError() {
        Reporter.log("Password is required.");
        String expectedPasswordError = "Password is required.";
        String actualPasswordError = getTextFromElement(passwordError);
        Assert.assertEquals(expectedPasswordError, actualPasswordError);
        CustomListeners.test.log(Status.PASS, "Password is required.");
    }

    public void verifyConfirmPasswordError() {
        Reporter.log("Password is required.");
        String expectedConfirmPasswordError = "Password is required.";
        String actualConfirmPasswordError = getTextFromElement(confirmPasswordError);
        Assert.assertEquals(expectedConfirmPasswordError, actualConfirmPasswordError);
        CustomListeners.test.log(Status.PASS, "Password is required.");
    }

    public void selectGender() {
        Reporter.log("Select Gender");
        clickOnElement(gender);
        CustomListeners.test.log(Status.PASS, "Select Gender");
    }

    public void sendFirstName() {
        Reporter.log("Enter First Name");
        sendTextToElement(firstName, "Prime");
        CustomListeners.test.log(Status.PASS, "Enter First Name");
    }

    public void sendLastName() {
        Reporter.log("Enter Last Name");
        sendTextToElement(lastName, "Testing");
        CustomListeners.test.log(Status.PASS, "Enter Last Name");
    }

    public void sendBirthDay() {
        Reporter.log("Select Birth Day");
        selectByVisibleTextFromDropDown(birthDay, "13");
        CustomListeners.test.log(Status.PASS, "Select Birth Day");
    }

    public void sendBirthMonth() {
        Reporter.log("Select Birth Month");
        selectByVisibleTextFromDropDown(birthMonth, "December");
        CustomListeners.test.log(Status.PASS, "Select Birth Month ");
    }

    public void sendBirthYear() {
        Reporter.log("Select Birth Year");
        selectByVisibleTextFromDropDown(birthYear, "1990");
        CustomListeners.test.log(Status.PASS, "Select Birth Year");
    }

    public void sendEmail(String email) {
        Reporter.log("Enter Email" + emailField.toString());
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Enter Email");
    }

    public void sendPassword() {
        Reporter.log("Enter Password");
        sendTextToElement(password, "prime@123");
        CustomListeners.test.log(Status.PASS, "Enter Password");
    }

    public void sendConfirmPassword() {
        Reporter.log("Enter Confirm Password" + confirmPassword.toString());
        sendTextToElement(confirmPassword, "prime@123");
        CustomListeners.test.log(Status.PASS, "Enter Confirm Password");
    }
    public void registerCompleteText(){
        Reporter.log("Your registration completed");
        String expectedRegistrationMsg = "Your registration completed";
        String actualRegistrationMsg = getTextFromElement(registerText);
        Assert.assertEquals(expectedRegistrationMsg,actualRegistrationMsg);
        CustomListeners.test.log(Status.PASS, "Registration completed");
    }
}
