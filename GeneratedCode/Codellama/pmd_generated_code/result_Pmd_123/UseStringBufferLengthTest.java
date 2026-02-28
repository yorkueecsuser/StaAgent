import org.junit.Test;
import static org.junit.Assert.*;

public class UseStringBufferLengthTest {
    @Test
    public void testShowBug() {
        StringBuffer str = new StringBuffer();
        // BUG: UseStringBufferLength
        // TRIGGER BUG: UseStringBufferLength
        if (str.toString().equals("")) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The string is not empty.");
        }
    }
}