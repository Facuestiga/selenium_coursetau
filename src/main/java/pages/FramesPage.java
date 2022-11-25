package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By linkNestedFrames = By.xpath("//a[@href='/nested_frames']");

    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFrames(){
        driver.findElement(linkNestedFrames).click();
        return new NestedFramesPage(driver);
    }


}
