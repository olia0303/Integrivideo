package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChatPage extends BasePage {
    public ChatPage(WebDriver driver) {
        super(driver);
    }
    //TODO all locators should be private static final and written using UPPER_CASE, e.g.
    //private static final By SETTINGS_BUTTON_BY =
    //TODO replace \" by '
    By settingsButtonBy = By.xpath(".//*[@class=\"integri-chat-settings integri-pointer\"]");
    By userNameBy = By.xpath(".//*[@name=\"userName\"]");
    By userEmailBy = By.xpath(".//*[@name=\"userEmail\"]");
    By saveButtonBy = By.xpath("//button[@class='integri-user-settings-save integri-button-blue']");
    By fieldInputTextBy = By.xpath(".//*[@placeholder=\"Start typing here\"]");
    By sendButtonBy = By.xpath(".//*[@title=\"Send message\"]");
    By userChatBy = By.xpath(".//div[@class=\"integri-session-user-name\"]");

    //TODO add space after each comma in method
    public ChatPage addNewUserInChat(String name,String email){
     click(settingsButtonBy);
     clear(userNameBy);
     writeText(userNameBy,name);
     writeText(userEmailBy,email);
     click(saveButtonBy);
     return this;
    }

    //TODO rename to verifyUserInfo
    //TODO verify userName in integri-session-user-name
    //TODO reopen settings window and validate name, URL, email
    public ChatPage verifyIsRegisteredUser(){
        //TODO remove. Does nothing
      assertTrue(userChatBy);
        return this;
    }
//TODO remove excessive spaces




}
