package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement returningCustomer;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailId;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;


    /**
     * get Returning Customer Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getReturningCustomerText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Customer Text " + returningCustomer.toString());
        CustomListeners.test.log(Status.PASS, "Customer Text " + returningCustomer);
        return getTextFromElement(returningCustomer);
    }

    /**
     * enter EmailId
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterEmailId(String value) throws InterruptedException {
        Thread.sleep(1000);

        Reporter.log("Enter email Id " + emailId.toString());
        CustomListeners.test.log(Status.PASS, "Enter email Id " + emailId);
        sendTextToElement(emailId, value);
    }

    /**
     * enter Password
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Enter the Password " + password.toString());
        CustomListeners.test.log(Status.PASS, "Enter the Password " + password);
        sendTextToElement(password, value);
    }

    /**
     * click On Login
     *
     * @throws InterruptedException
     */
    public void clickOnLogin() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on the login button " + loginButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on the login button " + loginButton);
        clickOnElement(loginButton);
    }
}
