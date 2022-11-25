package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeolocationPage {
    private WebDriver driver;
    private By button = By.xpath("//div//button[@onclick='getLocation()']");

    public GeolocationPage(WebDriver driver){
        this.driver = driver;
    }

    public String getButtonText(){
        return driver.findElement(button).getText();
    }
}
