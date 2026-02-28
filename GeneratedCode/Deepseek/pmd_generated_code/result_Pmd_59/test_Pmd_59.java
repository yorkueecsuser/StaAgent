import org.junit.Test;
import static org.junit.Assert.*;

class MainTest {
    
    @Test
    public void testShowBug() {
        Main.showBug();  // TRIGGER BUG: NonCaseLabelInSwitchStatement
    }
}