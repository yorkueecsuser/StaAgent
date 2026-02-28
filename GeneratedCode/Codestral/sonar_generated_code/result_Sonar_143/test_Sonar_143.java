import org.junit.Test;
import static org.junit.Assert.*;

public class RandomBugTest {

    @Test
    public void testGenerateRandomNumber() {
        RandomBug buggyObject = new RandomBug();
        int number1 = buggyObject.showBug(); // TRIGGER BUG: "Random" objects should be reused
        int number2 = buggyObject.showBug(); // TRIGGER BUG: "Random" objects should be reused
        assertNotEquals(number1, number2); // The two numbers should not be equal if "Random" objects are reused correctly
    }
}