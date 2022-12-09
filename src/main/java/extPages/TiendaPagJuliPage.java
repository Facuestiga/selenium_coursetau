package extPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TiendaPagJuliPage {

    private WebDriver driver;
    private By findListImages = By.xpath("//li//img[@width >229 and @height >229]");

    public TiendaPagJuliPage(WebDriver driver){
        this.driver = driver;
    }

    public List<WebElement> findListImgs () {
        List<WebElement> listImgs = driver.findElements(findListImages);
        System.out.println(listImgs.size());
        return listImgs;
    }
}
