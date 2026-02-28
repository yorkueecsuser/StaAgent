import org.junit.Test;
import static org.junit.Assert.*;

public class RandomBugTest {
    @Test
    public void testRandomObjectReuse() {
        RandomBug randomBug = new RandomBug();
        int randomNumber = randomBug.getRandomNumber();
        assertEquals(randomNumber, randomBug.showBug());
    }
}