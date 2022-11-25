package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage  {
    private WebDriver driver;
    private By box = By.xpath("//div[@id='hot-spot']");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void rightClick(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(box)).perform();
    }

    public String alert_getMessage(){
        return driver.switchTo().alert().getText();
    }

    public void alert_clickOk(){
        driver.switchTo().alert().accept();
    }
}
