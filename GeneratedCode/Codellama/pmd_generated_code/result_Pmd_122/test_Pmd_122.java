import org.junit.Test;
import static org.junit.Assert.*;

class BuggyAppTest {
    private String message = "Hello";

    @Test
    public void testShowBug() {
        message += " World";
        message += "!";
        System.out.println(message);
        // TRIGGER BUG: UseStringBufferForStringAppends
    }
}