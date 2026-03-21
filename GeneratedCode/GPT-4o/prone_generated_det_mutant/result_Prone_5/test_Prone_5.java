import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayToStringExampleTest {

    @Test
    public void testShowBug() {
        ArrayToStringExample example = new ArrayToStringExample();
        int[] numbers = {1, 2, 3, 4, 5};
        String result = example.showBug(numbers); // TRIGGER BUG: ArrayToString
        assertEquals("[1, 2, 3, 4, 5]", result); // TRIGGER BUG: ArrayToString
    }
}