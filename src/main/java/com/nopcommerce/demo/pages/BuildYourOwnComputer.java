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
public class BuildYourOwnComputer extends Utility {
    public BuildYourOwnComputer(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    //@FindBy(xpath = "//select[@id='product_attribute_1']")
    @FindBy(id = "product_attribute_1")
    //@FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorField;

    @CacheLookup
    @FindBy(id="product_attribute_2")
    //@FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramField;

    @CacheLookup
    //@FindBy(xpath = "//ul[@class='option-list'])[2]")
    @FindBy(id = "product_attribute_input_3")
    //@FindBy(xpath = "(//ul[@class='option-list'])[1]")
    WebElement hddField;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    //@FindBy(xpath = "//ul[@class='option-list'])[2]")
    //@FindBy(xpath = "//dd[@id='product_attribute_input_3']//ul[@class='option-list']")
    //@FindBy(id = "product_attribute_3_6")
    WebElement osField;

    @CacheLookup
    //@FindBy(xpath = "//ul[@class='option-list'])[3]")
    //@FindBy(xpath = "//dd[@id='product_attribute_input_4']//ul[@class='option-list']")
    @FindBy(name = "product_attribute_5")
    //@FindBy(id = "product_attribute_3_6")
    WebElement softwareField;

//    @CacheLookup
//    @FindBy(id = "product_attribute_3_7")
//    WebElement hdd400Field;
//    @CacheLookup
//    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
//    WebElement vistaHome;
//    @CacheLookup
//    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
//    WebElement vistaPremium;
//    @CacheLookup
//    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
//    WebElement microsoftOffice;
//    @CacheLookup
//    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
//    WebElement acrobat;
//    @CacheLookup
//    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
//    WebElement commander;
//    @CacheLookup
//    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
//    WebElement softwareField;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verifySuccessMessageText;

//    public void enterTheSelections(String processor, String ram,
//                                   String hdd, String os, String software) {
//        Reporter.log("Enter The Selections");
//        selectByVisibleTextFromDropDown(processorField, processor);
//        selectByVisibleTextFromDropDown(ramField, ram);
//        //clickOnElement1(hdd320Field, hdd);
//        //clickOnElement1(oSField, os);
//        clickOnElement1(softwareField, software);
//        CustomListeners.test.log(Status.PASS, "Enter The Selections");
//    }

    public void selectProcessor(String processor) {
        Reporter.log("Select Processor" + processorField.toString());
        CustomListeners.test.log(Status.PASS, "Select Processor" );
        selectByVisibleTextFromDropDown(processorField, processor);
    }

    public void selectRam(String ram) {
        Reporter.log("Select Ram" + ramField.toString());
        CustomListeners.test.log(Status.PASS, "Select Ram");
        selectByVisibleTextFromDropDown(ramField, ram);
    }

    public void selectHdd(String hdd) {
        Reporter.log("Select HDD " + hddField.toString());
        CustomListeners.test.log(Status.PASS, "Select HDD" );
        clickOnElement1(hddField, hdd);
    }

    //    public void selectHdd320(String hdd320) {
//        Reporter.log("Select HDD " + hdd320Field.toString());
//        CustomListeners.test.log(Status.PASS, "Select HDD" + hdd320Field);
//        clickOnElement1(hdd320Field, hdd320);
//    }
//
//    public void selectHdd400(String hdd400) {
//        Reporter.log("Select HDD " + hdd400Field.toString());
//        CustomListeners.test.log(Status.PASS, "Select HDD" + hdd400Field);
//        clickOnElement1(hdd400Field, hdd400);
//    }
//
//    public void selectMicrosoftOffice(String softwareMsOffice) {
//        Reporter.log("Select Software " + microsoftOffice.toString());
//        CustomListeners.test.log(Status.PASS, "Select Software" + microsoftOffice);
//        clickOnElement1(microsoftOffice, softwareMsOffice);
//    }
//
//    public void selectAcrobat(String softwareAcrobat) {
//        Reporter.log("Select Software " + acrobat.toString());
//        CustomListeners.test.log(Status.PASS, "Select Software" + acrobat);
//        clickOnElement1(acrobat, softwareAcrobat);
//    }
//
//    public void selectCommander(String softwareCommander) {
//        Reporter.log("Select Software " + commander.toString());
//        CustomListeners.test.log(Status.PASS, "Select Software" + commander);
//        clickOnElement1(commander, softwareCommander);
//    }
    public void selectOs(String os) {
        Reporter.log("Select OS " + osField.toString());
        CustomListeners.test.log(Status.PASS, "Select OS"+ os );
        clickOnElement1(osField, os);
    }
    public void selectSoftware(String software) {
        Reporter.log("Select Software " + softwareField.toString());
        CustomListeners.test.log(Status.PASS, "Select HDD" + software);
//        if (softwareField.isSelected()){
//            softwareField.clear();
//        }

        clickOnElement1(softwareField, software);
    }

    public void addToCart() {
        Reporter.log("Click On Add To Cart" + addToCart.toString());
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click On Add To Cart");
    }

    public void verifySuccessMessage() {
        Reporter.log("Verify Success Message" + verifySuccessMessageText.toString());
        String expectedMessage = "The product has been added to your shopping cart\n" +
                "\n";
        String actualMessage = getTextFromElement(verifySuccessMessageText);
        Assert.assertEquals(expectedMessage, actualMessage);
        CustomListeners.test.log(Status.PASS, "Verify Success Message");
    }
}
