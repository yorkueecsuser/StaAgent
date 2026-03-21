import org.junit.Test;
import static org.junit.Assert.*;

public class OuterClassTest {

    @Test
    public void testShowBug() {
        OuterClass outer = new OuterClass();
        // TRIGGER BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
        String result = outer.showBug("Inner class data");
        assertEquals("Serialization succeeded", result); // This assertion will fail due to the bug
    }
}