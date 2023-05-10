package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement shortPosition;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='HP LP3065']")
    WebElement productText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Desktops']")
    WebElement desktopText;


    By calender = By.xpath("//i[@class='fa fa-calendar']");
    By monthYearElement = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
//    By monthYearElement = By.xpath("(//th[@class='picker-switch'])[1](//th[@class='picker-switch'])[1]");


    By allDatesElement = By.xpath("//*[@class='datepicker-days']//tbody//tr//td");

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successFullText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next'][contains(text(),'›')]")
    WebElement next;


    /**
     * @return
     * @throws InterruptedException
     */
    public List<String> beforeSortDesktopByPositionZtoA() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Desktop Position Z to A before sorting");
        CustomListeners.test.log(Status.PASS, "Desktop Position Z to A before sorting");
        List<WebElement> beforeShortValue = driver.findElements(By.xpath("//div[@class='caption']//h4"));
        List<String> beforeShortDesktopValue = new ArrayList<>();
        for (WebElement value : beforeShortValue) {
            beforeShortDesktopValue.add(value.getText());
        }
        Collections.sort(beforeShortDesktopValue, String.CASE_INSENSITIVE_ORDER);// Ascending order

        Collections.reverse(beforeShortDesktopValue); // descending order
        return beforeShortDesktopValue;
    }

    /**
     * @return
     * @throws InterruptedException
     */
    public List<String> afterSortDesktopByPositionZtoA() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Desktop Position Z to A after sorting");
        CustomListeners.test.log(Status.PASS, "Desktop Position Z to A after sorting");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-sort']"), "Name (Z - A)");
        Thread.sleep(1000);
        // After shorting value
        List<WebElement> afterShortValue = driver.findElements(By.xpath("//div[@class='caption']//h4"));
        List<String> afterShortDesktopValue = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value1 : afterShortValue) {
            afterShortDesktopValue.add(value1.getText());
        }
        return afterShortDesktopValue;
    }

    /**
     * @param value
     * @throws InterruptedException
     */
    public void selectShortByPositionDropdownValue(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Select Short by position dropdown value");
        CustomListeners.test.log(Status.PASS, "Select Short by position dropdown value");

        selectByVisibleTextFromDropDown(shortPosition, value);
    }

    /**
     * This method is used to select product list
     *
     * @param product
     * @throws InterruptedException
     */
    public void selectProductFromList(String product) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("select product list");
        CustomListeners.test.log(Status.PASS, "select product list");
        clickOnElement(By.xpath("//a[normalize-space()='" + product + "']"));
    }

    /**
     * This method is used to get product text
     *
     * @return
     */
    public String getTextOfProduct() {
        Reporter.log("get product text " + productText.toString());
        CustomListeners.test.log(Status.PASS, "get product text " + productText);
        return getTextFromElement(productText);
    }

    /**
     * This method is used to success text
     *
     * @return
     */
    public String getSuccessfullText() {
        Reporter.log("Get success full text " + successFullText.toString());
        CustomListeners.test.log(Status.PASS, "get product text " + successFullText);
        return getTextFromElement(successFullText);
    }

    /**
     * select date
     *
     * @param date
     * @param month
     * @param year
     * @throws InterruptedException
     */
    public void selectDate(String date, String month, String year) throws InterruptedException {

        clickOnElement(calender);
        while (true) {
            Reporter.log("Select date ");
            CustomListeners.test.log(Status.PASS, "select date");

            String monthYear = driver.findElement(monthYearElement).getText();
            String[] a = monthYear.split(" ");
            String mon = a[0];
            String yer = a[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(next);
            }
        }
        Thread.sleep(1000);
        // Select the date
        List<WebElement> allDates = driver.findElements(allDatesElement);
        for (WebElement dt : allDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;
            }
        }
    }

    /**
     * This method is used to clickOnAddToCart
     *
     * @throws InterruptedException
     */
    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click on add to cart " + addToCart.toString());
        CustomListeners.test.log(Status.PASS, "select date " + addToCart);
        clickOnElement(addToCart);
    }

    /**
     * This method is used to click On Shopping Cart Link
     *
     * @throws InterruptedException
     */
    public void clickOnShoppingCartLink() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click On Shopping Cart Link " + shoppingCartLink.toString());
        CustomListeners.test.log(Status.PASS, "click On Shopping Cart Link " + shoppingCartLink);
        clickOnElement(shoppingCartLink);
    }

    /**
     * This method is used to get Desktop Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getDesktopText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Get Desktop text " + desktopText.toString());
        CustomListeners.test.log(Status.PASS, "Get Desktop text " + desktopText);
        return getTextFromElement(desktopText);
    }
}
