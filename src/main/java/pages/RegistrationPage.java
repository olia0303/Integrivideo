package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    By emailBy = By.xpath(".//*[@name=\"email\"]");
    By passwordBy = By.xpath(".//*[@name=\"password\"]");
    By signInButtonBy = By.xpath("//*[@id=\"signup-form\"]/button");
    By errorMessageUserBy = By.xpath("//span[@data-notify='message']");
    By messageUserBy = By.xpath("//span[@data-notify='message']");


    public RegistrationPage loginToUser (String login, String password){
        writeText(emailBy,login);
        writeText(passwordBy, password);
        click(signInButtonBy);
        return this;
    }

    //TODO do we need unused method?
    public RegistrationPage successRegistration(String expectedText) {
        assertEquals(messageUserBy, expectedText);
        return this;
    }

    //TODO get text from BY locator?
    //TODO rename to VerifyMessage
    public RegistrationPage verifyUser(String expectedText) {
        assertEquals(errorMessageUserBy, expectedText);
        return this;
    }






}
