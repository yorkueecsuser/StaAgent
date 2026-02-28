import org.junit.Test;
import static org.junit.Assert.*;

public class RandomCastExampleTest {

    @Test
    public void testShowBugWithMathRandom() {
        RandomCastExample example = new RandomCastExample();
        int result = example.showBugWithMathRandom();
        assertNotEquals(0, result); // TRIGGER BUG: RandomCast
    }

    @Test
    public void testShowBugWithRandomClass() {
        RandomCastExample example = new RandomCastExample();
        int result = example.showBugWithRandomClass();
        assertNotEquals(0, result); // TRIGGER BUG: RandomCast
    }

    @Test
    public void testShowBugWithRandomClassFloat() {
        RandomCastExample example = new RandomCastExample();
        int result = example.showBugWithRandomClassFloat();
        assertNotEquals(0, result); // TRIGGER BUG: RandomCast
    }
}