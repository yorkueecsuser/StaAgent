// MainTest.java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testShowBug() {
        Main main = new Main();
        
        boolean bugTriggered = main.showBug(); // TRIGGER BUG: "equals" methods should be symmetric and work for subclasses
        
        assertFalse("The bug should trigger, showing asymmetry in equals method.", bugTriggered); // This assertion should fail
    }
}