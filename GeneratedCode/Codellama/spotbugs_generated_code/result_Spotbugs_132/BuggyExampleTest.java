import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyExampleTest {
    @Test
    public void testBuggyExample() {
        String[] myArray = {"Hello", "World"};
        System.out.println(myArray.toString()); // TRIGGER BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }
}