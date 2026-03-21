import org.junit.Test;
import static org.junit.Assert.*;

public class AlwaysThrowsExampleTest {

    @Test
    public void testShowBug() {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        int[] numbers = {1, 2, 3};
        example.showBug(numbers); // TRIGGER BUG: AlwaysThrows
    }
}