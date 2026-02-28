import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testBugExample() {
        BugExample be = new BugExample();

        // Check if the same random number is returned multiple times
        int firstRandom = be.showBug();
        int secondRandom = be.showBug();
        
        assertNotEquals(firstRandom, secondRandom); // TRIGGER BUG: "Random" objects should be reused
    }
}