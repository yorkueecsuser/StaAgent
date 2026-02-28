import org.junit.Test;
import java.io.*;

public class SerializableClassTest {

    @Test
    public void testShowBug() {
        SerializableClass obj = new SerializableClass(10);
        obj.showBug(); // TRIGGER BUG: The non-serializable super class of a "Serializable" class should have a no-argument constructor
    }
}