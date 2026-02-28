import org.junit.Test;
import static org.junit.Assert.*;

public class SeBugTest {
    @Test
    public void testWriteObject() throws Exception {
        SeBug person = new SeBug("Alice", 30);
        FileOutputStream fileOut = new FileOutputStream("person.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        // TRIGGER BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
        out.writeObject(person);
        out.close();
        fileOut.close();
    }

    @Test
    public void testReadObject() throws Exception {
        SeBug person = new SeBug("Alice", 30);
        FileInputStream fileIn = new FileInputStream("person.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        // TRIGGER BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
        SeBug person2 = (SeBug) in.readObject();
        in.close();
        fileIn.close();
    }
}