package com.tutorialsninja.testsuite;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.CheckOutPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.pages.ShowAllLaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LaptopsAndNotebooksTest extends BaseTest {
    HomePage homePage;
    ShowAllLaptopsAndNotebooksPage showAllLaptopsAndNotebooksPage = new ShowAllLaptopsAndNotebooksPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        showAllLaptopsAndNotebooksPage = new ShowAllLaptopsAndNotebooksPage();
        shoppingCartPage = new ShoppingCartPage();
        checkOutPage = new CheckOutPage();
           }


    @Test(groups = {"sanity", "regression"})
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {
        String menuName = "Show AllLaptops & Notebooks";
        homePage.mouseHoverAndClickOnLaptopAndNoteBooks();
        homePage.selectMenu(menuName);
        String exceptedMessage = showAllLaptopsAndNotebooksPage.beforeSortPriceHighToLow().toString();
        String actualMessage = showAllLaptopsAndNotebooksPage.afterSortPriceHighToLow().toString();
        Assert.assertEquals(exceptedMessage, actualMessage);
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        String menuName = "Show AllLaptops & Notebooks";
        homePage.mouseHoverAndClickOnLaptopAndNoteBooks();
        homePage.selectMenu(menuName);
        showAllLaptopsAndNotebooksPage.shotByFilter("Price (High > Low)");
        showAllLaptopsAndNotebooksPage.selectProduct("MacBook");

        String expectedMessage = "MacBook";
        String actualMessage = showAllLaptopsAndNotebooksPage.getMacBookText();
        Assert.assertEquals(expectedMessage, actualMessage);

        showAllLaptopsAndNotebooksPage.clickOnAddToCart();
        expectedMessage = "Success: You have added MacBook to your shopping cart!\n";
        actualMessage = showAllLaptopsAndNotebooksPage.getSuccessText();
        String[] actualmsg = actualMessage.split("×");
        Assert.assertEquals(expectedMessage, actualmsg[0]);

        showAllLaptopsAndNotebooksPage.clickOnShoppingCartLink();

        expectedMessage = "Shopping Cart  (0.00kg)";
        actualMessage = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(expectedMessage, actualMessage);

        expectedMessage = "MacBook";
        actualMessage = shoppingCartPage.getMackBookText();
        Assert.assertEquals(expectedMessage, actualMessage);

        shoppingCartPage.updateQuantity("2");

        expectedMessage = "Success: You have modified your shopping cart!\n";
        actualMessage = shoppingCartPage.getSuccessText();
        String[] actualmsg1 = actualMessage.split("×");
        Assert.assertEquals(expectedMessage, actualmsg1[0]);

        expectedMessage = "$1,204.00";
        actualMessage = shoppingCartPage.getMackBookPriceText();
        Assert.assertEquals(expectedMessage, actualMessage);

        shoppingCartPage.clickOnCheckOutButton();

        expectedMessage = "Checkout";
        actualMessage = checkOutPage.getCheckOutText();
        Assert.assertEquals(expectedMessage, actualMessage);

        expectedMessage = "New Customer";
        actualMessage = checkOutPage.getNewCustomerText();
        Assert.assertEquals(expectedMessage, actualMessage);

        checkOutPage.clickOnGuestCheckOut();
        checkOutPage.clickOnContinueButton();
        checkOutPage.enterFirstName("Prime");
        checkOutPage.enterLastName("Testing");
        checkOutPage.enterEmail("primetesting123@gmail.com");
        checkOutPage.enterPhoneNumber("9812398123");
        checkOutPage.enterAddress1("Manjalpur");
        checkOutPage.enterCity("Vadodara");
        checkOutPage.enterPostCode("390019");
        checkOutPage.selectCountry("India");
        checkOutPage.selectRegion("Gujarat");
        checkOutPage.clickOnGuestContinue();
        checkOutPage.enterComments("My mac Book");
        checkOutPage.clickOnAgree();

        expectedMessage = "Warning: No Payment options are available. Please contact us for assistance!";
        actualMessage = checkOutPage.getPaymentWarningText();
        Assert.assertEquals(expectedMessage, actualMessage);





    }


}
