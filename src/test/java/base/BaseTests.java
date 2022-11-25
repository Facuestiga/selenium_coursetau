package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp(){
        //where is that the executable file that i need have because i need it in order to run
        //set up the property...
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        //instantiate webdriver --- https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html
        driver = new ChromeDriver();
        goHome();
        //instantiate homePage..
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
