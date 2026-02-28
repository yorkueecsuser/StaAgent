import org.junit.Test;
import static org.junit.Assert.*;

public class RandomCastBugTest {
    @Test
    public void testBug() {
        RandomCastBug buggyClass = new RandomCastBug();
        int randomInt = (int) buggyClass.showBug(); // TRIGGER BUG: RandomCast
        assertNotEquals(0, randomInt);
    }
}