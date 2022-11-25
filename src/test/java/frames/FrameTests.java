package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramesPage;

import static org.testng.Assert.*;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "World";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndentButton();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text from editor is not the same");
    }


    /**
     * Test click Frames - Nested Frames
     */
    @Test
    public void testNestedFrames(){
        FramesPage framesPage = homePage.clickFramesPage();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "The text inside of frame is not the same");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM","The text inside of frame is not the same" );
    }
}
