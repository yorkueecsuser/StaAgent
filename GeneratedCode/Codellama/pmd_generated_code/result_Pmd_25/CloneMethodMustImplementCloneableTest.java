import org.junit.Test;
import static org.junit.Assert.*;

public class CloneMethodMustImplementCloneableTest {

    @Test
    public void testCloneMethodMustImplementCloneable() throws CloneNotSupportedException {
        int[] numbers = {1, 2, 3, 4, 5};
        CloneMethodMustImplementCloneable cm = new CloneMethodMustImplementCloneable(numbers);
        CloneMethodMustImplementCloneable cmClone = (CloneMethodMustImplementCloneable) cm.clone();
        assertArrayEquals(cm.getNumbers(), cmClone.getNumbers());

        // TRIGGER BUG: CloneMethodMustImplementCloneable
        cmClone.showBug();
    }
}