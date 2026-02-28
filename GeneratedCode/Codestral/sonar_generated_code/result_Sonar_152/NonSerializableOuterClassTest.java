import org.junit.Test;
import static org.junit.Assert.*;

public class NonSerializableOuterClassTest {
    @Test
    public void showBugTest() {
        NonSerializableOuterClass outerClass = new NonSerializableOuterClass();
        outerClass.showBug(); // TRIGGER BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
    }
}