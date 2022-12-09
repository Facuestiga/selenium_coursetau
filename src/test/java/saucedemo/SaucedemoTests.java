package saucedemo;

import base.BaseTests;
import base.Task1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.logging.Logger;

public class SaucedemoTests {
    private WebDriver driver;


    private By usernameField = By.xpath("//input[@data-test='username']");
    private By passwordFiled = By.xpath("//input[@data-test='password']");
    private By loginButton = By.xpath("//input[@data-test='login-button']");
    private By bot = By.xpath("//div[@class='bot_column']");
    private By swagLogo = By.xpath("//div[@class='login_logo']");

    public void demoSetUp(){
        //where is that the executable file that i need have because i need it in order to run

        //set up the property...
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        //instantiate webdriver --- https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html
        driver = new ChromeDriver();
        driver.get("https://saucedemo.com/");

        WebElement username = driver.findElement(usernameField);
        String value = username.getAttribute("placeholder");
        String tagName = username.getTagName();

        System.out.println(tagName + " " + value);



        //close the browser...
        driver.quit();
    }

    public static void main(String[] args) {
        SaucedemoTests test = new SaucedemoTests();
        test.demoSetUp();
    }

}
