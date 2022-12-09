package base;

import extPages.HomePagePagJuli;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTestsPagJuli {

    private WebDriver driver;
    protected HomePagePagJuli homePagePagJuli;

    @BeforeClass
    public void setUp(){
        //where is that the executable file that i need have because i need it in order to run
        //set up the property...
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        //instantiate webdriver --- https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html
        driver = new ChromeDriver();

        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //-->
        goHomeJuli();

        //instantiate homePage..
        homePagePagJuli = new HomePagePagJuli(driver);
    }

    @BeforeMethod
    public void goHomeJuli(){
        driver.get("https://fg-audioyelectronica.com/");
    }

    @AfterClass
    public void tearDownJuli(){
        driver.quit();
    }

}
