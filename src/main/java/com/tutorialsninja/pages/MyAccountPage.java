package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility {

//    @CacheLookup
//    @FindBy(xpath = "//span[normalize-space()='My Account']")
//    WebElement ;
By myAccount =  By.xpath("//span[normalize-space()='My Account']");

    /**
     * This method is used to click on any tab of my account dropdown
     *
     * @param option
     */
    public void selectMyAccountOptions(String option) throws InterruptedException {
        Thread.sleep(1000);
//        Reporter.log("click on any tab of my account dropdown");
//        CustomListeners.test.log(Status.PASS, "click on any tab of my account dropdown");

        clickOnElement(myAccount);
        clickOnElement(By.xpath("(//a[normalize-space()='" + option + "'])[1]"));
    }

}
