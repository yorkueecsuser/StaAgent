import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexOutOfBoundsBugTest {
    private StringIndexOutOfBoundsBug buggyClass = new StringIndexOutOfBoundsBug();

    @Test
    public void testShowBug() {
        int beginIndex = 5;
        int endIndex = 2;
        String text = "This is a test string with a bug";
        // TRIGGER BUG: "String.indexOf" should be used with correct ranges
        buggyClass.showBug(text, beginIndex, endIndex);
    }

    @Test
    public void testShowBug2() {
        int beginIndex = -2;
        String text = "This is a test string with a bug";
        // TRIGGER BUG: "String.indexOf" should be used with correct ranges
        buggyClass.showBug2(text, beginIndex);
    }
}