import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseBugTest {
    @Test
    public void testShowBug() {
        int val = -10;
        int CONSTANT = -1;
        if ((val & CONSTANT) > 0) {
            System.out.println("The bitwise expression is positive");
        } else {
            System.out.println("The bitwise expression is negative");
        }
    }
}