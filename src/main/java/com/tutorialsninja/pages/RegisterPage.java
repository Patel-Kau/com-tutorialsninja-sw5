package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement registerAccount;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement accountCreatedText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement telephone;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement agree;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    /**
     * get Register Account Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getRegisterAccountText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Register Account Text " + registerAccount.toString());
        CustomListeners.test.log(Status.PASS, "Register Account Text " + registerAccount);
        return getTextFromElement(registerAccount);
    }

    /**
     * enter FirstName
     *
     * @param firstnNme
     * @throws InterruptedException
     */
    public void enterFirstName(String firstnNme) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Enter FirstName " + firstName.toString());
        CustomListeners.test.log(Status.PASS, "Enter FirstName " + firstName);
        sendTextToElement(firstName, firstnNme);
    }

    /**
     * enter LastName
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterLastName(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Enter LastName " + lastName.toString());
        CustomListeners.test.log(Status.PASS, "Enter LastName " + lastName);
        sendTextToElement(lastName, value);
    }

    /**
     * enter Email
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Enter Email Address " + email.toString());
        CustomListeners.test.log(Status.PASS, "Enter Email Address " + email);
        sendTextToElement(email, value);
    }

    /**
     * enter PhoneNumber
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterPhoneNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Enter PhoneNumber " + telephone.toString());
        CustomListeners.test.log(Status.PASS, "Enter PhoneNumber " + telephone);
        sendTextToElement(telephone, value);
    }

    /**
     * enter Password
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Enter Password " + password.toString());
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
        sendTextToElement(password, value);
    }

    /**
     * enter ConfirmPassword
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterConfirmPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Enter ConfirmPassword " + confirmPassword.toString());
        CustomListeners.test.log(Status.PASS, "Enter ConfirmPassword " + confirmPassword);
        sendTextToElement(confirmPassword, value);
    }

    /**
     * select Subscribe Button
     *
     * @param vaule
     * @throws InterruptedException
     */
    public void selectSubscribeButton(String vaule) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Select Subscribe Button ");
        CustomListeners.test.log(Status.PASS, "Select Subscribe Button");
        clickOnElement(By.xpath("//label[normalize-space()='" + vaule + "']"));
    }

    /**
     * click On Agree
     *
     * @throws InterruptedException
     */
    public void clickOnAgree() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click On Agree " + agree.toString());
        CustomListeners.test.log(Status.PASS, "click On Agree " + agree);
        clickOnElement(agree);
    }

    /**
     * click On Continue
     *
     * @throws InterruptedException
     */
    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click On Continue " + continueButton.toString());
        CustomListeners.test.log(Status.PASS, "Click On Continue " + continueButton);
        clickOnElement(continueButton);
    }

    /**
     * get Account CreatedText
     *
     * @return
     * @throws InterruptedException
     */
    public String getAccountCreatedText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Account CreatedText " + accountCreatedText.toString());
        CustomListeners.test.log(Status.PASS, "Account CreatedText " + accountCreatedText);
        return getTextFromElement(accountCreatedText);
    }


}
