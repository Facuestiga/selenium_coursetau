package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingPage;

public class WaitTests extends BaseTests {
    @Test
    public void testWaitUntilHidden(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingPage();
        DynamicLoadingExample1Page example1 = dynamicLoadingPage.clickExample1();
        example1.clickStart();
        assertEquals(example1.getLoadedText(), "Hello World!", "The test failed");

    }
}
