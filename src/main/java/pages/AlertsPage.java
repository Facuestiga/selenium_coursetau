package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton =By.xpath("//button[@onclick='jsAlert()']");

    private By confirmButton =By.xpath("//button[@onclick='jsConfirm()']");
    private By promptButton = By.xpath("//button[@onclick='jsPrompt()']");
    private By results = By.xpath("//p[@id='result']");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Method to click the button(1st button)
     */
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    /**
     * Method to get the result text
     */
    public String getResult(){
        return driver.findElement(results).getText();
    }

    /**
     * Method to click in JS Confirm (2nd Button)
     */
     public void triggerConfirm(){
        driver.findElement(confirmButton).click();
    }

    /**
     * Method to click in the Cancel button
     */
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    /**
     * Method to return the text that is displayed in the alert after to click in second button
     * *** I need use switchTo() to move me at the alert pop-up
     * @return
     */
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    /**
     * Method to click JS Prompt
     */
    public void triggerPrompt(){
        driver.findElement(promptButton).click();
    }

    /**
     * Method to enter a text in the prompt displayed(3st Button)
     * @param text text that it is entired
     */
    public void alert_enterText(String text){
        driver.switchTo().alert().sendKeys(text);
    }
}
