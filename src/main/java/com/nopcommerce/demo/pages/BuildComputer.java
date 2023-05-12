package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class BuildComputer extends Utility {
    public BuildComputer(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorF;

    @CacheLookup
    @FindBy (id = "product_attribute_2")
    WebElement ramF;

    @CacheLookup
    @FindBy (id = "product_attribute_input_3")
    WebElement hddF;

    @CacheLookup
    @FindBy(id="product_attribute_3_6")
    WebElement hdd320GB;

    @CacheLookup
    @FindBy(id="product_attribute_3_7")
    WebElement hdd400GB;

    @CacheLookup
    @FindBy(id="product_attribute_4_8")
    WebElement osVistaHome;

    @CacheLookup
    @FindBy(id="product_attribute_4_9")
    WebElement osVistaPremium;

    @CacheLookup
    @FindBy (id = "product_attribute_input_4")
    WebElement osF;

    @CacheLookup
    @FindBy (id = "product_attribute_input_5")
    WebElement softwareF;

    @CacheLookup
    @FindBy (id = "add-to-cart-button-1")
    WebElement addToCartF;

    @CacheLookup
    @FindBy (id = "product_attribute_5_11")
    WebElement acrobatReader;

    @CacheLookup
    @FindBy (id = "product_attribute_5_12")
    WebElement commander;

    @CacheLookup
    @FindBy (id = "product_attribute_5_10")
    WebElement msOffice;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement addToCartVerifyMsg;

    public void buildProcessor(String processor){
        selectByVisibleTextFromDropDown(processorF,processor);
    }
    public void buildRam(String ram){
        selectByVisibleTextFromDropDown(ramF, ram);
    }

    public void buildHdd(String hdd){
        clickOnElement1(hddF, hdd);
    }
    public void buildOs(String os){
        clickOnElement1(osF,os);
    }
    public void buildSoftware(String software){
        clickOnElement1(softwareF, software);
    }
    public void buildAddToCArt(){
        clickOnElement(addToCartF);
    }
    public void clickOnHDD320GB(){
        clickOnElement(hdd320GB);
    }
    public void clickOnHDD400GB(){
        clickOnElement(hdd400GB);
    }

    public void setOsVistaHome(){
        clickOnElement(osVistaHome);
    }
    public void setOsVistaPremium(){
        clickOnElement(osVistaPremium);
    }
    public void setAcrobatReader(){
        clickOnElement(acrobatReader);
    }
    public void setMsOffice(){
        clickOnElement(msOffice);
    }
    public void setCommander(){
        clickOnElement(commander);
    }
    public String getAddToCartVerifyMsg(){
        return getTextFromElement(addToCartVerifyMsg);
    }


}
