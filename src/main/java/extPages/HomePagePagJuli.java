package extPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePagePagJuli {


    private WebDriver driver;
    private By btnTienda = By.xpath("//a[@class='btn btn-primary']");

    public HomePagePagJuli(WebDriver driver){
        this.driver = driver;
    }

    public TiendaPagJuliPage clickIrATienda(){
        driver.findElement(btnTienda).click();
        return new TiendaPagJuliPage (driver);
    }
}
