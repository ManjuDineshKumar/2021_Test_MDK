package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import java.util.*;
import pageFactory.*;

import java.util.Properties;

public class Covid19GameBase {
    public WebDriver driver;
    public Covid19Game_Home_Page home;
    public BattleField_Landing_Page battle;
    public PublicBusGame_Page bus;
    public LearderShipBoard_Landing_Page score;
    public PublicPlaceGame_Page place;
    public WorkPlaceGame_Page work;
    public static Logger logger;
    public Properties configProperty;

}
