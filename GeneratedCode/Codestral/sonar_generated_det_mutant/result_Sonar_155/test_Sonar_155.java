import org.junit.Test;
import static org.junit.Assert.*;
import java.io.InvalidClassException;

public class SerializableClassTest {
    @Test(expected = InvalidClassException.class)
    public void testShowBug() throws Exception {
        SerializableClass obj = new SerializableClass(10, 20);
        obj.showBug();
    }
}