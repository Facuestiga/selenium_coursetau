package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By figureBox = By.xpath("//img[@alt='User Avatar']");
    private By boxCaption = By.xpath("//div//div[@class='figcaption']");

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @param index starts at 1
     */
    public FigureCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(figureBox).get(index - 1);

        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform(); //--> this class contains a lot of advanced interaction for our web elements
        return new FigureCaption(figure.findElement(boxCaption));
    }

    public class FigureCaption{
        private WebElement caption;

        private By header = By.tagName("h5");
        private  By link = By.xpath("//div//a[@href='/users/1']");

        public  FigureCaption (WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getTitle(){
            return caption.findElement(header).getText();
        }

        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }

    }//end FigureCaption class
}
