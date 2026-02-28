import org.junit.Test;
import static org.junit.Assert.*;

public class PrintfBugTest {
    @Test(expected = Exception.class)
    public void testShowBug1() {
        // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        new PrintfBug().showBug1();
    }

    @Test(expected = Exception.class)
    public void testShowBug2() {
        // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        new PrintfBug().showBug2();
    }

    @Test(expected = Exception.class)
    public void testShowBug3() {
        // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        new PrintfBug().showBug3();
    }

    @Test(expected = Exception.class)
    public void testShowBug4() {
        // TRIGGER BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        new PrintfBug().showBug4();
    }
}