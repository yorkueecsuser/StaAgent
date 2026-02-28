import org.junit.Test;
import static org.junit.Assert.*;

public class RandomCastExampleTest {

    @Test
    public void testShowBug() {
        RandomCastExample example = new RandomCastExample();
        int result = example.showBug(); // TRIGGER BUG: RandomCast
        assertEquals(1, result); // This assertion will fail because the result is always 0
    }

    @Test
    public void testShowBug1() {
        RandomCastExample example = new RandomCastExample();
        long result = example.showBug1(); // TRIGGER BUG: RandomCast
        assertEquals(1L, result); // This assertion will fail because the result is always 0
    }

    @Test
    public void testShowBug2() {
        RandomCastExample example = new RandomCastExample();
        int result = example.showBug2(); // TRIGGER BUG: RandomCast
        assertEquals(1, result); // This assertion will fail because the result is always 0
    }
}