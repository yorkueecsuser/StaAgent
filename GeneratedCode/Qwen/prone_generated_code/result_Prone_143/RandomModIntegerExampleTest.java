import org.junit.Test;
import static org.junit.Assert.*;

public class RandomModIntegerExampleTest {

    @Test
    public void testShowBugNegativeResult() {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(5); // TRIGGER BUG: RandomModInteger
        assertTrue("Result should be non-negative", result >= 0);
    }

    @Test
    public void testShowBugRangeInclusion() {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(5); // TRIGGER BUG: RandomModInteger
        assertTrue("Result should be less than 5", result < 5);
    }

    @Test
    public void testShowBugUniformDistribution() {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int[] counts = new int[5];
        for (int i = 0; i < 10000; i++) {
            int result = example.showBug(5); // TRIGGER BUG: RandomModInteger
            counts[result]++;
        }
        for (int count : counts) {
            assertTrue("Distribution should be more uniform", count > 1000 && count < 3000);
        }
    }
}