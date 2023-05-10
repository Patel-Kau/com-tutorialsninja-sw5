package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement checkOutText;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement newCustomerText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckOut;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement telephone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement address1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcode;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement region;

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement comments;

    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement agree;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-warning alert-dismissible']")
    WebElement warningText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement guestContinueButton;

    /**
     * This method is used to get Check Out Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getCheckOutText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("This method is used to get Check Out Text " + checkOutText.toString());
        CustomListeners.test.log(Status.PASS, "This method is used to get Check Out Text " + checkOutText);
        return getTextFromElement(checkOutText);
    }

    /**
     * This method is used to get New Customer Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getNewCustomerText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("This method is used to get New Customer Text " + newCustomerText.toString());
        CustomListeners.test.log(Status.PASS, "This method is used to get New Customer Text " + newCustomerText);
        return getTextFromElement(newCustomerText);
    }

    /**
     * This method is used click on Guest Checkout Button
     *
     * @throws InterruptedException
     */
    public void clickOnGuestCheckOut() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("This method is used click on Guest Checkout Button " + guestCheckOut.toString());
        CustomListeners.test.log(Status.PASS, "This method is used click on Guest Checkout Button " + guestCheckOut);
        clickOnElement(guestCheckOut);
    }

    /**
     * This method is used click on  Checkout Button
     *
     * @throws InterruptedException
     */
    public void clickOnContinueButton() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("This method is used click on  Checkout Button " + continueButton.toString());
        CustomListeners.test.log(Status.PASS, "This method is used click on  Checkout Button " + continueButton);
        clickOnElement(continueButton);
    }

    /**
     * This method is used to enter FirstName
     *
     * @param firstnNme
     * @throws InterruptedException
     */
    public void enterFirstName(String firstnNme) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("This method is used to enter FirstName " + firstName.toString());
        CustomListeners.test.log(Status.PASS, "This method is used to enter FirstName " + firstName);
        sendTextToElement(firstName, firstnNme);
    }

    /**
     * This method is used to enter LastName
     *
     * @param name
     * @throws InterruptedException
     */
    public void enterLastName(String name) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("This method is used to enter LastName " + lastName.toString());
        CustomListeners.test.log(Status.PASS, "This method is used to enter LastName " + lastName);
        sendTextToElement(lastName, name);
    }

    /**
     * This method is used to enter email
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("This method is used to enter email " + email.toString());
        CustomListeners.test.log(Status.PASS, "This method is used to enter email " + email);
        sendTextToElement(email, value);
    }

    /**
     * This method is used to enter phone Number
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterPhoneNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("This method is used to enter phone Number " + telephone.toString());
        CustomListeners.test.log(Status.PASS, "This method is used to enter phone Number " + telephone);
        sendTextToElement(telephone, value);
    }

    /**
     * This method is used to enter  Address1
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterAddress1(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("This method is used to enter  Address1 " + address1.toString());
        CustomListeners.test.log(Status.PASS, "This method is used to enter  Address1 " + address1);
        sendTextToElement(address1, value);
    }

    /**
     * This method is used to enter city
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterCity(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("This method is used to enter city " + city.toString());
        CustomListeners.test.log(Status.PASS, "This method is used to enter city " + city);
        sendTextToElement(city, value);
    }

    /**
     * This method is used to enter post code
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterPostCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("This method is used to enter post code " + postcode.toString());
        CustomListeners.test.log(Status.PASS, "This method is used to enter post code " + postcode);
        sendTextToElement(postcode, value);
    }

    /**
     * This method is used to select country
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectCountry(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("This method is used to select country " + country.toString());
        CustomListeners.test.log(Status.PASS, "This method is used to select country " + country);
        selectByVisibleTextFromDropDown(country, value);
    }

    /**
     * This method is used to select Region
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectRegion(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("This method is used to select Region " + region.toString());
        CustomListeners.test.log(Status.PASS, "This method is used to select Region " + region);
        selectByVisibleTextFromDropDown(region, value);
    }

    /**
     * click on Guest Continue
     *
     * @throws InterruptedException
     */
    public void clickOnGuestContinue() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click on Guest Continue " + guestContinueButton.toString());
        CustomListeners.test.log(Status.PASS, "click on Guest Continue " + guestContinueButton);
        clickOnElement(guestContinueButton);
    }

    /**
     * Enter Comment
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterComments(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Enter Comment " + comments.toString());
        CustomListeners.test.log(Status.PASS, "Enter Comment " + comments);
        sendTextToElement(comments, value);
    }

    /**
     * This method is used to click agree
     *
     * @throws InterruptedException
     */
    public void clickOnAgree() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("This method is used to click agree " + agree.toString());
        CustomListeners.test.log(Status.PASS, "This method is used to click agree " + agree);
        clickOnElement(agree);
    }

    /**
     * This method is used to get payment warring message
     *
     * @return
     * @throws InterruptedException
     */
    public String getPaymentWarningText() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("This method is used to get payment warring message " + warningText.toString());
        CustomListeners.test.log(Status.PASS, "This method is used to get payment warring message " + warningText);
        return getTextFromElement(warningText);
    }

}
