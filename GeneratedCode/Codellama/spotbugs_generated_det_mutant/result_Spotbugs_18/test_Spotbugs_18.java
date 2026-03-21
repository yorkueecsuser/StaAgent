import org.junit.Test;
import static org.junit.Assert.*;

public class RandomIntegerAbsoluteValueTest {

    @Test
    public void testAbsoluteValueOfRandomInt() {
        RandomIntegerAbsoluteValue randomIntegerAbsoluteValue = new RandomIntegerAbsoluteValue();
        int randomInt = randomIntegerAbsoluteValue.showBug();
        int absoluteValue = Math.abs(randomInt);

        assertEquals(randomInt, absoluteValue);
        // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
    }
}