import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

public class LocalDateBugTest {

    @Test(expected = UnsupportedOperationException.class) // TRIGGER BUG: LocalDateTemporalAmount
    public void testShowBug() {
        LocalDateBug bug = new LocalDateBug();
        LocalDate result = bug.showBug();
        // The above line should throw an UnsupportedOperationException due to the bug in LocalDateBug class
    }
}