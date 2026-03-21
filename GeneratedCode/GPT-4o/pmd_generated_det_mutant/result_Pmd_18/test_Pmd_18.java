import org.junit.Test;
import static org.junit.Assert.*;

public class OctalValueExampleTest {

    @Test
    public void testShowBug() {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug(); // TRIGGER BUG: AvoidUsingOctalValues
        assertEquals("The calculation should result in 120 if no octal values were used.", 120, result); // TRIGGER BUG: AvoidUsingOctalValues
    }
}