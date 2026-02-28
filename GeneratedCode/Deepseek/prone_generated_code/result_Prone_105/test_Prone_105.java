import org.junit.Test;
import static org.junit.Assert.*;

public class MisleadingEscapedSpaceTest {
    MisleadingEscapedSpace instance = new MisleadingEscapedSpace();

    @Test
    public void testShowBug() {
        String expected = """
            one \s
            two \s
            three
            """; // This statement will cause a compile-time error because of the misleading escaped space.
        String actual = instance.showBug();
        assertEquals(expected, actual); // This will fail because of the misleading escaped space.
        // TRIGGER BUG: MisleadingEscapedSpace
    }
}