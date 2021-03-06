package pageFactory;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.List;

public class LearderShipBoard_Landing_Page {

    WebDriver driver;
    public LearderShipBoard_Landing_Page(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//*[text()='COVID-19 THE GAME - LEADERBOARD']")
    WebElement scoreBoardTitle;

    @FindBy(id="showData")
    WebElement scoreBoardTable;

    public void verifyLeadershipBoardTitle()
    {
        boolean titleVisibleCheck = scoreBoardTitle.isDisplayed();
        if (titleVisibleCheck == true)
            System.out.println("\n"+"Final Scoreboard is Displayed");
        else
            System.out.println("\n"+"Scoreboard Title not displayed");

    }

    public void verifyFinalScoreOfWarrior(String warrior) {
        String warriorname = warrior.trim();
        List<WebElement> scorBoardTableRows = scoreBoardTable.findElements(By.tagName("tr"));
        boolean myWarriorFoundInBoard = false;
        boolean warriorNameFound = false;
        int count = 0;

        for (WebElement row : scorBoardTableRows) {
            List<WebElement> scorBoardTableColumns = row.findElements(By.tagName("td"));
            for (WebElement col : scorBoardTableColumns) {
                String warriorTextValue = col.getText();
                myWarriorFoundInBoard = warriorTextValue.contains(warriorname);

                if (myWarriorFoundInBoard == true)
                    warriorNameFound = true;

                if ((warriorNameFound == true) && myWarriorFoundInBoard == false) {
                    System.out.println("\n" + warriorname + ": your final score is - " + warriorTextValue +"\n");
                    break;
                }
            }
            if ((warriorNameFound == true) && myWarriorFoundInBoard == false)
                break;
            }

        if(warriorNameFound == false)
            System.out.println("You haven't scored yet.Continue Fighting");

    }

}
