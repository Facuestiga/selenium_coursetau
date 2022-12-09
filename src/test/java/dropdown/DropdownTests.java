package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    String option1 = "Option 1";
    String option2 = "Option 2";


    @Test
    public void testSelectOption(){
       var dropDownPage = homePage.clickDropDown();
       dropDownPage.selectFromDropDown(option1);
       var selectedOptions = dropDownPage.getSelectedOptions();

       assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
       assertTrue(selectedOptions.contains(option1), "Option not selected");
    }

    @Test
    public void testChangeDropdown(){
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.changeDropdown();
        dropDownPage.selectFromDropDown(option1);
        dropDownPage.selectFromDropDown(option2);

        List<String> optionsSelected = dropDownPage.getSelectedOptions();

        assertEquals(optionsSelected.size(), 2, "Error in elements of List");
        assertTrue(optionsSelected.contains(option1), "Option 1 not selected");
        assertTrue(optionsSelected.contains(option2), "Option 2 not selected");

    }
}
