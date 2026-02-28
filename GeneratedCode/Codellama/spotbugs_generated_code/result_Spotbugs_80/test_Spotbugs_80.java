import org.junit.Test;
import static org.junit.Assert.*;

public class BadComparisonTest {
    @Test
    public void testShowBug() {
        byte[] input = new byte[] { (byte) 255 };
        BadComparison.showBug(input);
    }
}