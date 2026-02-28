import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ExceptionTriggerTest {

    @Test(expected = IllegalArgumentException.class)
    public void testShowBugWithInvalidIndex() {
        ExceptionTrigger example = new ExceptionTrigger();
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        // This will trigger an IllegalArgumentException // TRIGGER BUG: Calls to methods should not trigger an exception
        example.showBug(myList, 2);
    }
}