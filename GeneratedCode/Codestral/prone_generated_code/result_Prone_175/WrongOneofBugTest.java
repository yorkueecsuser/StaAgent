import org.junit.Test;
import static org.junit.Assert.*;

public class WrongOneofBugTest {

    @Test
    public void testShowBug() {
        WrongOneofBug bug = new WrongOneofBug();
        WrongOneofBug.Blah blah = bug.new Blah();

        // Test case that triggers the bug
        blah.setBlahCase(WrongOneofBug.BlahCase.BAR);
        blah.setBar("BarValue");
        assertEquals("BarValue", bug.showBug(blah)); // TRIGGER BUG: WrongOneof, expected "BarValue" but got "null"
    }
}