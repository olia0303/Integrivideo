package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
    WebDriver driver;
    private WebDriverWait wait;
    private static final int TIMEOUT = 10;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,TIMEOUT);
    }

    //TODO add spaces before {
    public void waitVisibilityAll(By elementBy){
         wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
    //TODO add empty line before each method
    public void clear(By elementBy){
        waitVisibilityAll(elementBy);
        driver.findElement(elementBy).clear();
    }
    public void click(By elementBy){
        waitVisibilityAll(elementBy);
        driver.findElement(elementBy).click();
    }
    public void writeText (By elementBy, String text) {
        waitVisibilityAll(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    public String readText (By elementBy) {
        waitVisibilityAll(elementBy);
        return driver.findElement(elementBy).getText();

//TODO remove excessive spaces
    }
    public void assertTrue (By elementBy){
        waitVisibilityAll(elementBy);
        //TODO remove
        Assert.assertTrue(true);
    }
    public void assertEquals (By elementBy, String expectedText) {
        waitVisibilityAll(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
//TODO remove excessive spaces
    }
}