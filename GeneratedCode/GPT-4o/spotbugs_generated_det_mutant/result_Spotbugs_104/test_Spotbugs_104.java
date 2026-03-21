import org.junit.Test;
import static org.junit.Assert.*;

public class BadAppletConstructorExampleTest {

    @Test
    public void testShowBugTriggersBAC() {
        BadAppletConstructorExample applet = new BadAppletConstructorExample();
        applet.showBug(); // TRIGGER BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
        
        assertNull("Expected message to be null due to uninitialized AppletStub", applet.getParameter("message"));
    }
}