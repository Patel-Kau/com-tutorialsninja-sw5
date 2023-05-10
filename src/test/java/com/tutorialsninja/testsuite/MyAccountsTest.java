package com.tutorialsninja.testsuite;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.UUID;

@Listeners(CustomListeners.class)
public class MyAccountsTest extends BaseTest {

    String email;
    MyAccountPage myAccountPage ;
    RegisterPage registerPage;
    LoginPage loginPage;
    HomePage homePage;


    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        myAccountPage = new MyAccountPage();
        registerPage = new RegisterPage();
        loginPage = new LoginPage();

    }


    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        String option = "Register";
        myAccountPage.selectMyAccountOptions(option);
        String expectedMessage = "Register Account";
        String actualMessage = registerPage.getRegisterAccountText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        String option = "Login";
        myAccountPage.selectMyAccountOptions(option);
        String expectedMessage = "Returning Customer";
        String actualMessage = loginPage.getReturningCustomerText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test(groups = "regression")
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        String name = UUID.randomUUID().toString();
        email = name + "@gmail.com";
        String option = "Register";
        myAccountPage.selectMyAccountOptions(option);
        registerPage.enterFirstName("Prime");
        registerPage.enterLastName("Testing");
        registerPage.enterEmail(email);
        registerPage.enterPhoneNumber("9898989898");
        registerPage.enterPassword("Admin@123");
        registerPage.enterConfirmPassword("Admin@123");
        registerPage.selectSubscribeButton("Yes");
        registerPage.clickOnAgree();
        registerPage.clickOnContinue();

        String expectedMessage = "Your Account Has Been Created!";
        String actualMessage = registerPage.getAccountCreatedText();
        Assert.assertEquals(expectedMessage, actualMessage);
        option = "Logout";
        myAccountPage.selectMyAccountOptions(option);

        expectedMessage = "Account Logout";
        actualMessage = homePage.getAccountLogoutText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test(groups = "regression")
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        String option = "Login";
        myAccountPage.selectMyAccountOptions(option);
        loginPage.enterEmailId("admin123456@gmail.com");
        loginPage.enterPassword("Admin@123");
        loginPage.clickOnLogin();
        String expectedMessage = "My Account";
        String actualMessage = homePage.getMyAccountText();
        Assert.assertEquals(expectedMessage, actualMessage);
        option = "Logout";
        myAccountPage.selectMyAccountOptions(option);

        expectedMessage = "Account Logout";
        actualMessage = homePage.getAccountLogoutText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

}