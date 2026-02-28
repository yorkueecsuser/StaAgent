import org.junit.Test;
import static org.junit.Assert.*;

public class CustomImmutableListTest {

    @Test
    public void testAddMethodDirectly() {
        CustomImmutableList<String> myList = new CustomImmutableList<>();
        myList.showBug("This should trigger the bug"); // TRIGGER BUG: DoNotCall
    }

    @Test
    public void testAddMethodUsingShowBug() {
        CustomImmutableList<String> myList = new CustomImmutableList<>();
        myList.showBug("Another trigger for the bug"); // TRIGGER BUG: DoNotCall
    }
}