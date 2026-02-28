import org.junit.Test;
import static org.junit.Assert.*;

public class RandomUsageExampleTest {

    @Test
    public void testShowBug() {
        RandomUsageExample example = new RandomUsageExample();
        int firstResult = example.showBug(); // TRIGGER BUG: "Random" objects should be reused
        int secondResult = example.showBug(); // TRIGGER BUG: "Random" objects should be reused
        assertNotEquals("showBug method should produce different results", firstResult, secondResult);
    }

    @Test
    public void testShowBug2() {
        RandomUsageExample example = new RandomUsageExample();
        int firstResult = example.showBug2(); // TRIGGER BUG: "Random" objects should be reused
        int secondResult = example.showBug2(); // TRIGGER BUG: "Random" objects should be reused
        assertNotEquals("showBug2 method should produce different results", firstResult, secondResult);
    }
}