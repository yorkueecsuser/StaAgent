import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class NonSerializableExampleTest {

    @Test
    public void testShowBug() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("dummy.txt");
        } catch (FileNotFoundException e) {
            // This block is not supposed to execute in this context.
        }
        NonSerializableExample example = new NonSerializableExample(1, "Test", fileInputStream);
        example.showBug(); // TRIGGER BUG: NonSerializableClass

        try {
            ByteArrayOutputStream byteOutStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutStream = new ObjectOutputStream(byteOutStream);
            objectOutStream.writeObject(example); // TRIGGER BUG: NonSerializableClass
            objectOutStream.close();
            fail("Expected an exception due to non-serializable field"); // This line should not be reached
        } catch (IOException e) {
            // Expected behavior due to non-serializable FileInputStream
        }
    }
}