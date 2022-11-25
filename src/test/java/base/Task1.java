package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {

    private WebDriver driver;

    public void setUp(){
        //where is that the executable file that i need have because i need it in order to run

        //set up the property...
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        //instantiate webdriver --- https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContentLink.click();

        shiftingContentLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        shiftingContentLink.click();
                                                    //.findElements(By.xpath("//ul//li"));
        List<WebElement> list = driver.findElements(By.xpath("//ul//li"));
        System.out.println(list.size());

        //close the browser...
        driver.quit();
    }

    public static void main(String[] args) {
        Task1 test = new Task1();
        test.setUp();
    }

}
