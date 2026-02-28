import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidInstanceofChecksInCatchClauseTest {
    @Test
    public void testAvoidInstanceofChecksInCatchClause() {
        try {
            // some code that throws an exception
            throw new Exception("Test exception");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
            // BUG: AvoidInstanceofChecksInCatchClause
            if (e instanceof RuntimeException) {
                System.out.println("This is a runtime exception");
            } else {
                System.out.println("This is an I/O exception");
            }
        }
    }
}