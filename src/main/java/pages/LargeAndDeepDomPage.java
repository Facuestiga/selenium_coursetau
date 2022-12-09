package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {
    private WebDriver driver;
    private By table = By.xpath("//table[@id='large-table']");

    public LargeAndDeepDomPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Method that use Javascript in order to scroll to the table
     */
    public void scroolToTable(){
        //create element to find the table
        WebElement tableElement = driver.findElement(table);

        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);
    }
}
