import org.junit.Test;
import static org.junit.Assert.*;

class SomeEJB {

    private static int CountA;          // BUG: StaticEJBFieldShouldBeFinal

    private static final int CountB = 10;

    public SomeEJB() {
        // Constructor without exceptions to avoid compilation errors
    }

    public int showBug() {
        CountA++;
        return CountA;
    }
}

public class SomeEJBTest {

    @Test
    public void testShowBugTriggersBug() {
        SomeEJB ejb1 = new SomeEJB();
        SomeEJB ejb2 = new SomeEJB();

        assertEquals(1, ejb1.showBug()); // TRIGGER BUG: StaticEJBFieldShouldBeFinal
        assertEquals(2, ejb2.showBug()); // TRIGGER BUG: StaticEJBFieldShouldBeFinal
    }
}