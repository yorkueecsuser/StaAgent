import org.junit.Test;
import static org.junit.Assert.*;

public class HardcodedSDCardTest {
    HardcodedSDCard hd = new HardcodedSDCard();

    @Test
    public void testShowBug() {
        String expectedResult = "/sdcard/mypackage";
        String actualResult = hd.showBug();
        assertEquals(expectedResult, actualResult); // Trigger BUG: DoNotHardCodeSDCard
    }
}