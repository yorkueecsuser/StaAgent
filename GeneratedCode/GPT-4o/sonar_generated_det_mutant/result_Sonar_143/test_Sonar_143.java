import org.junit.Test;
import static org.junit.Assert.*;

public class RandomGeneratorExampleTest {

    @Test
    public void testShowBug() {
        RandomGeneratorExample example = new RandomGeneratorExample();
        
        int firstRandomNumber = example.showBug(); // TRIGGER BUG: "Random" objects should be reused
        int secondRandomNumber = example.showBug(); // TRIGGER BUG: "Random" objects should be reused

        // The test fails if the two generated numbers are the same, indicating a lack of randomness
        assertNotEquals("Random numbers should not be the same", firstRandomNumber, secondRandomNumber);
    }
}