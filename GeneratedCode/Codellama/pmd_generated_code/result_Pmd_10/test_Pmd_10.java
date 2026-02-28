import org.junit.Test;
import static org.junit.Assert.*;

class AvoidDuplicateLiteralsTest {
    @Test
    public void testShowBug() {
        AvoidDuplicateLiterals buggyClass = new AvoidDuplicateLiterals();
        buggyClass.showBug(); // TRIGGER BUG: AvoidDuplicateLiterals
    }
}