import org.junit.Test;
import static org.junit.Assert.*;

public class DuplicateLiteralsExampleTest {

    @Test
    public void testShowBug() {
        DuplicateLiteralsExample example = new DuplicateLiteralsExample();
        assertEquals("Bug demonstrated with duplicate literals", example.showBug()); // TRIGGER BUG: AvoidDuplicateLiterals
    }
}