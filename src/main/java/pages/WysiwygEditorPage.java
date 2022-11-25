package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;

    private String editorIframeId = "mce_0_ifr";

    private By textArea = By.xpath("//body[@data-id='mce_0']");

    private By decreaseIndentButton = By.xpath("//button[@aria-label='Increase indent']");

    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }


    /**
     * Method to switch to <iframe></iframe>
     */
    private void switchToEditArea(){

        driver.switchTo().frame(editorIframeId);
    }

    /**
     * Method to clear text area
     */
    public void clearTextArea(){
        switchToEditArea(); // --> move to text area
        driver.findElement(textArea).clear(); // --> clear text area
        switchToMainArea();
    }

    /**
     * Method to send a text
     */
    public void setTextArea(String text){
        switchToEditArea(); // --> move to text area
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();

    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void decreaseIndentButton(){
        driver.findElement(decreaseIndentButton).click();
    }

    /**
     * Method to go bach to the main area
     */
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
