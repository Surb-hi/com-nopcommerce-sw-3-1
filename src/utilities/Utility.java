package utilities;

import browsertesting.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Utility extends BaseTest {

    //This Method will click on element
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //This method will get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //This method will send the keys
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    public void sendTextToElement(By by) {
        driver.findElement(by).clear();
    }


    // This method will select the option by visible text
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);

    }
    //store value
    public List<WebElement> listOfWebElementsList(By by){
        return  driver.findElements(by);
    }
    //mouse hover
    public void mousehover(By by){
        Actions actions = new Actions(driver);
        WebElement menu=driver.findElement(by);
        actions.moveToElement(menu).build().perform();
    }
}