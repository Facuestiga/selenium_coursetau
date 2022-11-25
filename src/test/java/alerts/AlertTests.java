package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;
import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert" , "The message displayed is incorrect");
    }

    @Test
    public void testConfirmAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        assertEquals(alertsPage.alert_getText(), "I am a JS Confirm" , "The message displayed is incorrect");
        alertsPage.alert_clickToDismiss();
        assertEquals(alertsPage.getResult(), "You clicked: Cancel" , "The message displayed is incorrect ");
    }



    @Test
    public void testInputPrompt(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String myText = "My input text";
        alertsPage.alert_enterText(myText);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + myText, "The message is not the same");
    }
}
