package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.HorizontalSliderPage;

public class SliderTests extends BaseTests {

    @Test
    public void testSliderToWholeNumber(){
        String value = "4";
        var horizontalSliderPage = homePage.clickHorizantalSlider();
        horizontalSliderPage.setSliderValue(value);
        assertEquals(horizontalSliderPage.getSliderValue(), value, "Slider value is incorrect");
    }

}
