import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InvalidClassException;
import java.io.NotActiveException;
import java.io.StreamCorruptedException;
import java.io.UTFDataFormatException;
import java.io.OptionalDataException;

public class SingletonExampleTest {

    @Test
    public void testSingletonSerialization() throws IOException, ClassNotFoundException {
        SingletonExample example = SingletonExample.getInstance();
        String result = example.showBug(); // TRIGGER BUG: SING: Class using singleton design pattern directly or indirectly implements Serializable interface. (SING_SINGLETON_IMPLEMENTS_SERIALIZABLE)
        assertEquals("Same instance", result); // This assertion will fail, demonstrating the bug
    }
}