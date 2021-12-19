package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Covid19Game_Home_Page {
    WebDriver driver;

    public Covid19Game_Home_Page(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(id="worrior_username")
    WebElement warriorUserName;

    @FindBy(id="warrior")
    WebElement createWarriorButton;

    @FindBy(id="start")
    WebElement startJourneyButton;
    public void enterWarriorNameAndClickCreateWarrrior(String warrior)
    {
        boolean userField = warriorUserName.isDisplayed();
        if (userField==true) {
            warriorUserName.clear();
            warriorUserName.sendKeys(warrior);
            createWarriorButton.click();
        }

    }

    public void clickToStartTheGame()
    {
        boolean startbutton=startJourneyButton.isDisplayed();
        if(startbutton==true){
            startJourneyButton.click();
        }

    }

    public void verifyUserCreationSuccessful(String warrior)
    {
        String warriorName=warrior.trim();
        boolean startbutton=startJourneyButton.isDisplayed();
        String userCreationText= startJourneyButton.getText();
        boolean userCreated=userCreationText.contains(warriorName);
        if((startbutton==true)&& (userCreated ==true))
            System.out.println("\n"+"User Creation Successful"+"\n");
        else
            System.out.println("\n"+"User Creation Failed"+"\n");

    }

    public void clickCreateWarriorButton()
    {
        createWarriorButton.click();

    }
}
