import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testNotFinalIsFinal() {
        int expectedValue = 30;
        assertEquals(expectedValue, Main.notFinal);
    }
}