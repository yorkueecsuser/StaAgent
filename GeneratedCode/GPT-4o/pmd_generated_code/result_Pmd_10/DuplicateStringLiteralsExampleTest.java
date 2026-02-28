import org.junit.Test;
import static org.junit.Assert.*;

public class DuplicateStringLiteralsExampleTest {

    @Test
    public void testShowBug() {
        DuplicateStringLiteralsExample example = new DuplicateStringLiteralsExample();
        example.showBug(); // TRIGGER BUG: AvoidDuplicateLiterals
    }
}