import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class NonSerializableOuterClassTest {
    @Test
    public void testShowBug() {
        NonSerializableOuterClass outer = new NonSerializableOuterClass();
        outer.showBug(); // TRIGGER BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
    }
}