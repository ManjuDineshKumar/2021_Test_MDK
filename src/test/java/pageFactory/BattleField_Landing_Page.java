package pageFactory;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class BattleField_Landing_Page {
    WebDriver driver;

    public BattleField_Landing_Page(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }

     @FindBy(className="alpha-heading")
     WebElement gameTitle;

    @FindBy(id="bus")
    WebElement publicTransportGameButton;

    @FindBy(id="restaurant")
    WebElement publicPlaceGameButton;

    @FindBy(id="office")
    WebElement workPlaceGameButton;

    public void verifyGameTItle(String pageTitle)
    {
        boolean Title=gameTitle.isEnabled();
        String titleOfPage=pageTitle.trim();
        Assert.assertEquals("Title of the game is not displayed",titleOfPage,driver.getTitle());

    }

    public void clickOnTakeTheBusGame()
    {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,6000)");
            publicTransportGameButton.click();

    }

    public void clickOnGoToAPublicPlaceGame()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,9000)");
        publicPlaceGameButton.click();

    }
    public void clickOnGoToTheOfficeGame()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,9000)");
        workPlaceGameButton.click();

    }
}
