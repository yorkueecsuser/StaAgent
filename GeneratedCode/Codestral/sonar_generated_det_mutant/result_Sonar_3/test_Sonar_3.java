import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexOutOfBoundsBugTest {
    @Test
    public void testShowBug() {
        StringIndexOutOfBoundsBug bug = new StringIndexOutOfBoundsBug();
        String mainString = "Hello, World!";
        String subString = "World";
        int beginIndex = 12; // should be less than endIndex
        int endIndex = 5; // should be greater than beginIndex

        // TRIGGER BUG: "String.indexOf" should be used with correct ranges
        bug.showBug(mainString, subString, beginIndex, endIndex);
    }
}