import org.junit.Test;
import static org.junit.Assert.*;

class VolatileBugExampleTest {

    @Test
    public void testIncrementCount() throws InterruptedException {
        VolatileBugExample example = new VolatileBugExample();
        int expectedCount = 1000; // Assuming we expect 1000 increments
        int result = example.showBug(expectedCount); // TRIGGER BUG: "volatile" variables should not be used with compound operators
        assertEquals(expectedCount, result);
    }

    @Test
    public void testToggleBoo() throws InterruptedException {
        VolatileBugExample example = new VolatileBugExample();
        int iterations = 1000; // Number of iterations to toggle boo
        example.showBug2(iterations); // TRIGGER BUG: "volatile" variables should not be used with compound operators
        // Since boo is a boolean, after an even number of iterations, it should be false
        assertFalse(example.showBug2(0)); 
    }
}