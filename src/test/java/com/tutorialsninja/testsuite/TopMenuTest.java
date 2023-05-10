package com.tutorialsninja.testsuite;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.ComponentPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShowAllLaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {



    HomePage homePage;
    DesktopPage desktopPage;
    ShowAllLaptopsAndNotebooksPage showAllLaptopsAndNotebooksPage;
    ComponentPage componentPage;


    @BeforeMethod(alwaysRun = true)
    public void init(){
        homePage = new HomePage();
        desktopPage = new DesktopPage();
        showAllLaptopsAndNotebooksPage= new ShowAllLaptopsAndNotebooksPage();
        componentPage= new ComponentPage();

    }
//    DesktopPage desktopPage = new DesktopPage();
//
//    ShowAllLaptopsAndNotebooksPage showAllLaptopsAndNotebooksPage= new ShowAllLaptopsAndNotebooksPage();
//    ComponentPage componentPage= new ComponentPage();

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
        String menuName = "Show AllDesktops";
        homePage.mouseHoverAndClickOnDesktop();
        homePage.selectMenu(menuName);
        String expectedMessage = "Desktops";
        String actualMessage = desktopPage.getDesktopText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() throws InterruptedException {
        String menuName = "Show AllLaptops & Notebooks";
        homePage.mouseHoverAndClickOnLaptopAndNoteBooks();
        homePage.selectMenu(menuName);
        String expectedMessage = "Laptops & Notebooks";
        String actualMessage = showAllLaptopsAndNotebooksPage.getLaptopsAndNotebooksText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() throws InterruptedException {
        String menuName = "Show AllComponents";
        homePage.mouseHoverAndClickOnComponent();
        homePage.selectMenu(menuName);
        String expectedMessage = "Components";
        String actualMessage = componentPage.getComponentText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

}
