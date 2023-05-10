package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'HP LP3065')])[2]")
    WebElement productText;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'MacBook')])[2]")
    WebElement mackBookText;

    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Product 21']")
    WebElement modelText;

    @CacheLookup
    @FindBy(xpath = "(//small)[2]")
    WebElement deliveryDateText;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name,'quantity')]")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-refresh']")
    WebElement updateButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successText;

    @CacheLookup
    @FindBy(xpath = "(//td[@class='text-right'][normalize-space()='$122.00'])[4]")
    WebElement priceText;

    @CacheLookup
    @FindBy(xpath = "(//td[@class='text-right'][normalize-space()='$1,204.00'])[3]")
    WebElement mackBookPriceText;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkOut;


    /**
     * get Shopping Cart Text
     * @return
     * @throws InterruptedException
     */
    public String getShoppingCartText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Shopping Cart Text "+ shoppingCartText.toString());
        CustomListeners.test.log(Status.PASS, "Shopping Cart Text "+shoppingCartText);
        return getTextFromElement(shoppingCartText);
    }

    /**
     * get Product Text
     * @return
     * @throws InterruptedException
     */
    public String getProductText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Product Text "+ productText.toString());
        CustomListeners.test.log(Status.PASS, "Product Text "+ productText);
        return getTextFromElement(productText);
    }

    /**
     * get MackBook Text
     * @return
     * @throws InterruptedException
     */
    public String getMackBookText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("MackBook Text "+ mackBookText.toString());
        CustomListeners.test.log(Status.PASS, "MackBook Text "+ mackBookText);
        return getTextFromElement(mackBookText);
    }


    /**
     * get ModelText
     * @return
     * @throws InterruptedException
     */
    public String getModelText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("ModelText "+ modelText.toString());
        CustomListeners.test.log(Status.PASS, "ModelText "+ modelText);
        return getTextFromElement(modelText);
    }

    /**
     * get Delivery Date Text
     * @return
     * @throws InterruptedException
     */
    public String getDeliveryDateText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Delivery Date Text "+ deliveryDateText.toString());
        CustomListeners.test.log(Status.PASS, "Delivery Date Text "+ deliveryDateText);
        return getTextFromElement(deliveryDateText);
    }

    /**
     * get Price Text
     * @return
     * @throws InterruptedException
     */
    public String getPriceText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Price Text "+ priceText.toString());
        CustomListeners.test.log(Status.PASS, "Price Text "+priceText);
        return getTextFromElement(priceText);
    }

    /**
     * update Quantity
     * @param value
     * @throws InterruptedException
     */
    public void updateQuantity(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Update Quantity "+updateButton.toString());
        CustomListeners.test.log(Status.PASS,"Update Quantity "+updateButton);
        sendTextToElement(quantity,value);
        clickOnElement(updateButton);
    }

    /**
     * get Success Text
     * @return
     * @throws InterruptedException
     */
    public String getSuccessText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Success Text "+ successText.toString());
        CustomListeners.test.log(Status.PASS, "Success Text "+ successText);
        return getTextFromElement(successText);
    }

    /**
     * get MackBook PriceText
     * @return
     * @throws InterruptedException
     */
    public String getMackBookPriceText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("MackBook PriceText "+ mackBookPriceText.toString());
        CustomListeners.test.log(Status.PASS, " MackBook PriceText "+ mackBookPriceText);
        return getTextFromElement(mackBookPriceText);
    }

    /**
     * click OnCheck OutButton
     * @throws InterruptedException
     */
    public void clickOnCheckOutButton() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("On Check Out Button "+checkOut.toString());
        CustomListeners.test.log(Status.PASS, "On Check Out Button "+ checkOut);
        clickOnElement(checkOut);
    }


}
