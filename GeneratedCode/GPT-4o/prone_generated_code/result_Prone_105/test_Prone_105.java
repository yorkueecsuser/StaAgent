import org.junit.Test;
import static org.junit.Assert.*;

public class MisleadingEscapedSpaceExampleTest {

    @Test
    public void testShowBug() {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        String result = example.showBug(); // TRIGGER BUG: MisleadingEscapedSpace
        String expected = "one  \ntwo  \nthree\n"; // Expect normal spaces, not escaped

        assertEquals(expected, result); // TRIGGER BUG: MisleadingEscapedSpace
    }
}