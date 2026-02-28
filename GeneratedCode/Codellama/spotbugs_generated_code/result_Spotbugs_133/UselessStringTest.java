import org.junit.Test;
import org.junit.Assert;

public class UselessStringTest {
    private UselessString uselessString = new UselessString();

    @Test
    public void testUselessString() {
        int[] numbers = {1, 2, 3, 4, 5};
        String result = uselessString.showBug(numbers);
        assertEquals("[1, 2, 3, 4, 5]", result);
    }
}