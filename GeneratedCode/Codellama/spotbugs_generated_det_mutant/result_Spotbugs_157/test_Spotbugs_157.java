import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ExampleTest {
    @Test
    public void testBug() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // TRIGGER BUG: HSM: Method hiding should be avoided. (HSM_HIDING_METHOD)
        System.out.println(numbers.get(2));

        fail("Method hiding should be avoided");
    }
}