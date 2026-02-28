import org.junit.Test;
import static org.junit.Assert.*;

public class OuterClassTest {

    @Test
    public void testShowBug() {
        OuterClass outerClass = new OuterClass();
        String result = outerClass.showBug(); // TRIGGER BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
        assertEquals("Serialization succeeded.", result); // TRIGGER BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
    }
}