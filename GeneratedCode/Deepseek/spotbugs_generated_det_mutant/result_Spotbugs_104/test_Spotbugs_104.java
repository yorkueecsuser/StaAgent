import org.junit.Test;
import static org.junit.Assert.*;

public class BadAppletConstructorTest {
    @Test
    public void testShowBug() {
        BadAppletConstructor applet = new BadAppletConstructor();
        applet.showBug(); // TRIGGER BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
    }
}