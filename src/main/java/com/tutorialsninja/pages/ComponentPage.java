package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComponentPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Components']")
    WebElement componentText;


    /**
     * This method is used to get component text
     *
     * @return
     * @throws InterruptedException
     */
    public String getComponentText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Component Text " + componentText.toString());
        CustomListeners.test.log(Status.PASS, "Component text " + componentText);
        return getTextFromElement(componentText);
    }
}
