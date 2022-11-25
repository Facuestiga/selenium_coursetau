package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String frameLeft= "frame-left";
    private String frameTop = "frame-top";
    private String frameBottom = "frame-bottom";
    private By body = By.tagName("body");
    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    private void switchToFrameTop(){
        driver.switchTo().frame(frameTop);
    }
    private void switchToFrameLeft(){
        driver.switchTo().frame(frameLeft);
    }

    private void switchToFrameBottom(){
        driver.switchTo().frame(frameBottom);
    }
    private void switchToMainFrame(){
        driver.switchTo().parentFrame();
    }

    public String getLeftFrameText(){
        switchToFrameTop();
        switchToFrameLeft();
        String text = getFrameText();
        switchToMainFrame();
        switchToMainFrame();
        return text;
    }

    public String getBottomFrameText()
    {
        switchToFrameBottom();
        String text = getFrameText();
        switchToMainFrame();
        return text;
    }
    private String getFrameText(){
        return driver.findElement(body).getText();
    }

}
