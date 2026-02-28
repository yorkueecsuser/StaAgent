import org.junit.Test;
import static org.junit.Assert.*;

public class StringComparisonBugTest {
    @Test
    public void testStringComparison() {
        String firstName = "John";
        String lastName = "Doe";

        if (firstName == lastName) {
            System.out.println("First name and last name are the same.");
        } else {
            System.out.println("First name and last name are different.");
        }
    }
}