import org.junit.Test;
import static org.junit.Assert.*;

public class MisleadingEscapedSpaceExampleTest {

    @Test
    public void testMisleadingEscapedSpace() {
        MisleadingEscapedSpaceExample example = new MisleadingEscapedSpaceExample();
        String result = example.showBug(); // TRIGGER BUG: MisleadingEscapedSpace
        assertEquals("one \ntwo \nthree\n", result); // This assertion will fail due to the bug
    }
}