import org.junit.Test;
import static org.junit.Assert.*;

public class Bug_DurationFromTest {

    @Test
    public void testShowBug() {
        Bug_DurationFrom bug = new Bug_DurationFrom();
        assertEquals(2, bug.showBug().size()); // TRIGGER BUG: DurationFrom
    }

    @Test
    public void testShowBug2() {
        Bug_DurationFrom bug = new Bug_DurationFrom();
        bug.showBug2(); // TRIGGER BUG: DurationFrom
    }
}