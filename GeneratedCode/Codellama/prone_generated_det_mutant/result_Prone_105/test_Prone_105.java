import org.junit.Test;
import static org.junit.Assert.*;

public class MisleadingEscapedSpaceTest {
    @Test
    public void testMisleadingEscapedSpace() {
        String colors = """
            one \s
            two \s
            three
            """;
        assertEquals("one two three", colors);
        // TRIGGER BUG: MisleadingEscapedSpace
    }
}