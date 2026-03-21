import org.junit.Test;
import static org.junit.Assert.*;

public class BadAppletConstructorTest {

    @Test
    public void testShowBugTriggersBug() {
        BadAppletConstructor badApplet = new BadAppletConstructor();
        String result = badApplet.showBug(); // TRIGGER BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR) 
        assertEquals(null, result); // This assertion will pass, but the bug is triggered by the constructor call
    }
}