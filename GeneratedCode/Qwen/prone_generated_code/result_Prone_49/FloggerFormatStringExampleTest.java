import org.junit.Test;
import static org.junit.Assert.*;

public class FloggerFormatStringExampleTest {

    @Test
    public void testShowBug() {
        FloggerFormatStringExample example = new FloggerFormatStringExample();
        example.showBug("Alice", 30); // TRIGGER BUG: FloggerFormatString
    }
}