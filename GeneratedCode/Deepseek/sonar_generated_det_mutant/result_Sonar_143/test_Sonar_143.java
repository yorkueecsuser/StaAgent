import org.junit.Test;
import static org.junit.Assert.*;

public class RandomBugTest {

    private RandomBug bug = new RandomBug();

    @Test
    public void testShowBug() {
        int number1 = bug.showBug();  // TRIGGER BUG: "Random" objects should be reused
        int number2 = bug.showBug();  // TRIGGER BUG: "Random" objects should be reused

        assertNotEquals(number1, number2);
    }
}