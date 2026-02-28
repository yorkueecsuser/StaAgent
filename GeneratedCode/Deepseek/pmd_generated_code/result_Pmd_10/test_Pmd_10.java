import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidDuplicateLiteralsTest {
    AvoidDuplicateLiterals obj = new AvoidDuplicateLiterals();

    @Test
    public void testShowBug() {
        obj.showBug();
        // TRIGGER BUG: AvoidDuplicateLiterals
    }
}