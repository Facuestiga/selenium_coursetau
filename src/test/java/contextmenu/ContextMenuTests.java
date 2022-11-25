package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClick();
        String message = contextMenuPage.alert_getMessage();
        assertEquals(message, "You selected a context menu", "The message displayed is incorrect");
        contextMenuPage.alert_clickOk();

    }
}
