package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[@class='dropdown-toggle'][normalize-space()='Desktops']")
    WebElement desktop;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
    WebElement allLaptopAndNoteBooks;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Components']")
    WebElement component;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Account Logout']")
    WebElement accountLogout;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement myAccount;


    /**
     * This method is used to select menu
     *
     * @param menu
     */
    public void selectMenu(String menu) {
        Reporter.log("select menu ");
        CustomListeners.test.log(Status.PASS, "select menu");
        clickOnElement(By.xpath("//nav[@id='menu']//a[normalize-space()='" + menu + "']"));
    }

    /**
     * This method is used to mouse Hover And Click On Desktop
     *
     * @throws InterruptedException
     */
    public void mouseHoverAndClickOnDesktop() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("mouse Hover And Click On Desktop " + desktop.toString());
        CustomListeners.test.log(Status.PASS, "mouse Hover And Click On Desktop " + desktop);
        mouseHoverToElementAndClick(desktop);

    }

    /**
     * This method is used to mouse Hover Click On Laptop And NoteBooks
     *
     * @throws InterruptedException
     */
    public void mouseHoverAndClickOnLaptopAndNoteBooks() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Mouse Hover Click On Laptop And NoteBooks " + allLaptopAndNoteBooks.toString());
        CustomListeners.test.log(Status.PASS, "mouse Hover Click On Laptop And NoteBooks " + allLaptopAndNoteBooks);
        mouseHoverToElementAndClick(allLaptopAndNoteBooks);
    }

    /**
     * mouseHover And Click On Component
     *
     * @throws InterruptedException
     */
    public void mouseHoverAndClickOnComponent() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click On Component " + component.toString());
        CustomListeners.test.log(Status.PASS, "Click On Component " + component);
        mouseHoverToElementAndClick(component);
    }

    /**
     * get Account Logout Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getAccountLogoutText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Account Logout Text " + accountLogout.toString());
        CustomListeners.test.log(Status.PASS, "Account Logout Text " + accountLogout);
        return getTextFromElement(accountLogout);
    }

    /**
     * get My Account Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getMyAccountText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("My Account Text "+ myAccount.toString());
        CustomListeners.test.log(Status.PASS, "My Account Text "+ myAccount);
        return getTextFromElement(myAccount);
    }


}
