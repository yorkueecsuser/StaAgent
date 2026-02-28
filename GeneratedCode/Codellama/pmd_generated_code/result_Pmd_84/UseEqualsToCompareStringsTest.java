import org.junit.Test;
import static org.junit.Assert.*;

public class UseEqualsToCompareStringsTest {
    @Test
    public void testBug() {
        String s1 = "Hello";
        String s2 = "Hello";

        if (s1 == s2) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }

        // TRIGGER BUG: UseEqualsToCompareStrings
    }
}