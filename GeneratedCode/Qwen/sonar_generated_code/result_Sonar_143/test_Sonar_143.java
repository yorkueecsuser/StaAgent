import org.junit.Test;
import static org.junit.Assert.*;

public class RandomReuseExampleTest {

    @Test
    public void testShowBug() {
        RandomReuseExample example = new RandomReuseExample();
        int result1 = example.showBug(); // TRIGGER BUG: "Random" objects should be reused
        int result2 = example.showBug(); // TRIGGER BUG: "Random" objects should be reused
        assertEquals(result1, result2); // This assertion will likely fail due to the lack of reusing the Random object
    }

    @Test
    public void testShowBug1() {
        RandomReuseExample example = new RandomReuseExample();
        int result1 = example.showBug1(); // TRIGGER BUG: "Random" objects should be reused
        int result2 = example.showBug1(); // TRIGGER BUG: "Random" objects should be reused
        assertEquals(result1, result2); // This assertion will likely fail due to the lack of reusing the Random object
    }

    @Test
    public void testShowBug2() {
        RandomReuseExample example = new RandomReuseExample();
        int result1 = example.showBug2(); // TRIGGER BUG: "Random" objects should be reused
        int result2 = example.showBug2(); // TRIGGER BUG: "Random" objects should be reused
        assertEquals(result1, result2); // This assertion will likely fail due to the lack of reusing the Random object
    }
}