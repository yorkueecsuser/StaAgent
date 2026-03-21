import org.junit.Test;
import static org.junit.Assert.*;

public class MutualRecursionExampleTest {

    @Test
    public void testShowBug() {
        MutualRecursionExample example = new MutualRecursionExample();
        // This test will trigger the bug due to mutual recursion leading to stack overflow.
        // TRIGGER BUG: MUTUAL_RECURSION_CYCLE​
        example.showBug(5);
    }
}