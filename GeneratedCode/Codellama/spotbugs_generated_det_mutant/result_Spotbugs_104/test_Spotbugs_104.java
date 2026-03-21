import org.junit.Test;
import org.junit.Assert;
import javax.swing.JApplet;
import java.applet.AppletStub;

public class BadAppletConstructorTest {
    @Test
    public void testBug() {
        BadAppletConstructor badAppletConstructor = new BadAppletConstructor();
        badAppletConstructor.showBug();
        AppletStub stub = badAppletConstructor.getAppletStub();
        Assert.assertNotNull(stub);
    }
}