import org.junit.Test;
import static org.junit.Assert.*;

public class CovariantArrayExampleTest {

    @Test
    public void testShowBugWithIntegerInStringArray() {
        CovariantArrayExample example = new CovariantArrayExample();
        String[] stringArray = {"Hello"};
        example.showBug(stringArray, 123); // TRIGGER BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
    }
}