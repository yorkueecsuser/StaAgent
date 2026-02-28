import org.junit.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class BuzzTest {

    @Test(expected = IOException.class)
    public void testShowBug() throws IOException {
        Buzz buzz = new Buzz();
        buzz.showBug(new FileInputStream("dummy.txt")); // TRIGGER BUG: NonSerializableClass
    }
}