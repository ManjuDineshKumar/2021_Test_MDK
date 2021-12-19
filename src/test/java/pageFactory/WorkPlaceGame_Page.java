package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.testng.util.TimeUtils;
import utilities.WaitHelper;

import java.util.concurrent.TimeUnit;

public class WorkPlaceGame_Page {

    WebDriver driver;
    WaitHelper waitHelp;

    public WorkPlaceGame_Page(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
        waitHelp= new WaitHelper(driver);

    }

    @FindBy(id="start")
    WebElement gameStartButton;

    @FindBy(id="office_answer_1")
    WebElement safeoption;

    @FindBy(xpath ="//*[@id='staticBackdropLabel' and contains(text(),'That is correct!')]")
    WebElement result;

    @FindBy(id="leaderboard_link")
    WebElement scoreboard;

    @FindBy(id="img-protection_poster")
    WebElement timeUpImage;

    public void clickonStartButton()
    {
        boolean startButton=gameStartButton.isDisplayed();
        if(startButton==true){
            gameStartButton.click();
        }

    }

    public void clickSafeOption()
    {
        safeoption.click();

    }

    public void checkTheResult()
    {
        boolean resultVisible=result.isEnabled();
        if (resultVisible==true) {
            System.out.println("\n" + "This Game's Result is Displayed ");
        }
        else
            System.out.println("\n"+"Result not Displayed");

    }

    public void cilckFinalScoreButton()
    {
        scoreboard.click();

    }

    public void WaitForTimeOut()throws InterruptedException
    {
        waitHelp.WaitForElement(timeUpImage,30);

    }

    public void VerifyTimeOut()
    {
        boolean timeUpImageVisible=timeUpImage.isEnabled();
        if (timeUpImageVisible==true)
            System.out.println("\n"+"TimeUp"+"\n");
            System.out.println("Timeout,Click the button try again to continue"+"\n");

    }

}

