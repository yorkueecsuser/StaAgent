import org.junit.Test;
import static org.junit.Assert.*;

public class DuplicateLiteralsBugTest {

    @Test
    public void testShowBug() {
        DuplicateLiteralsBug buggyCode = new DuplicateLiteralsBug();
        buggyCode.showBug();
        // TRIGGER BUG: AvoidDuplicateLiterals - The bug is triggered when the same string literal "Howdy" is used multiple times in the bar() method.
    }
}