package homePagePagJuli;

import base.BaseTestsPagJuli;
import extPages.HomePagePagJuli;
import extPages.TiendaPagJuliPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.List;

public class testsTienda extends BaseTestsPagJuli {

    private WebDriver driver;
    int expectedCant = 16;

    @Test
    public void testGoTienda(){
        HomePagePagJuli homePagePagJuli1 = new HomePagePagJuli(driver);
        TiendaPagJuliPage tiendaPagJuliPage = homePagePagJuli1.clickIrATienda();
        List<WebElement> imagesList = tiendaPagJuliPage.findListImgs();
        assertEquals(expectedCant, "The size of list of images are OK  ", "Error in size of list images");
    }
}
