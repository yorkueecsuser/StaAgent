import org.junit.Test;
import static org.junit.Assert.*;

public class EnumBugTest {
    EnumBug enumBug = new EnumBug();

    @Test // TRIGGER BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM)
    public void testShowBug() {
        EnumBug.Color c1 = EnumBug.Color.RED;
        EnumBug.Color c2 = EnumBug.Color.BLUE;

        // This will return false even if c1 and c2 are the same color
        EnumBug.Color result = enumBug.showBug();
        // This will assert if the result is not equal to c2 which is expected to be BLUE
        assertEquals(result, c2);
    }
}