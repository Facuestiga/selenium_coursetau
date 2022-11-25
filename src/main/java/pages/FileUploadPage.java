package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By fileUpload = By.xpath("//input[@id='file-upload']");
    private By fileSubmit = By.xpath("//input[@id='file-submit']");
    private By uploadedFiles = By.xpath("//div[@id='uploaded-files']");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(fileSubmit).click();
    }

    /**
     * Provides path of file to the form then clicks Upload button
     * @param absolutePathOfFile The complete path of the file to upload
     */
    public void uploadFile (String absolutePathOfFile){
        driver.findElement(fileUpload).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedFiles(){
       return driver.findElement(uploadedFiles).getText();
    }
}
