import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class OuterClassTest {

    @Test(expected = IOException.class)
    public void testSerializableBug() throws IOException {
        OuterClass outerObj = new OuterClass();
        outerObj.showBug(); // TRIGGER BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
    }
}