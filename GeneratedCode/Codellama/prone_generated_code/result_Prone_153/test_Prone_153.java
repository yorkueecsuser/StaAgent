import org.junit.Test;
import static org.junit.Assert.*;

class BuggyClassTest {
    @Test
    public void testShowBug() {
        BuggyClass buggyClass = new BuggyClass();
        String[] args = {"1", "2", "3"};
        buggyClass.showBug(args); // TRIGGER BUG: ShouldHaveEvenArgs
    }
}