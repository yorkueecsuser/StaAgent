import static org.junit.Assert.*;
import org.junit.Test;

public class ComparisonOutOfRangeBugTest {
    @Test
    public void testContains() {
        ComparisonOutOfRangeBug bug = new ComparisonOutOfRangeBug();
        byte[] numbers = {1, 2, 3, 4, 5};
        byte[] numbers2 = {6, 7, 8, 9, 10};
        byte[] numbers3 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // TRIGGER BUG: ComparisonOutOfRange
        bug.showBug(numbers);
        bug.showBug(numbers2);
        bug.showBug(numbers3);
    }
}