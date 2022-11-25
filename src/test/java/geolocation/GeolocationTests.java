package geolocation;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.GeolocationPage;

import static org.testng.Assert.assertEquals;

public class GeolocationTests extends BaseTests {


    @Test
    public void testButtonMessage(){

        GeolocationPage geolocationPage = homePage.clickGeolocation();
        assertEquals(geolocationPage.getButtonText(), "Where am I?" , "The message displayed is incorrect.");
    }


}
