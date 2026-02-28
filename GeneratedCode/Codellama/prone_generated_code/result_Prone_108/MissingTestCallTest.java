import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert.EqualsTester;

public class MissingTestCallTest {
    @Test
    public static void testString() {
        EqualsTester equalsTester = new EqualsTester();
        equalsTester.addEqualityGroup("hello", new String("hello"));
        equalsTester.addEqualityGroup("world", new String("world"));
        equalsTester.addEqualityGroup(2, Integer.valueOf(2));
        // BUG: MissingTestCall
    }
}