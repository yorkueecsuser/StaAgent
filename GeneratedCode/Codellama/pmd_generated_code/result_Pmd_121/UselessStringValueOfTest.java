import org.junit.Test;
import static org.junit.Assert.*;

public class UselessStringValueOfTest {
    @Test
    public void testUselessStringValueOf() {
        UselessStringValueOf uselessStringValueOf = new UselessStringValueOf();
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(str);
        assertEquals("Hello, World!10", str);
    }
}