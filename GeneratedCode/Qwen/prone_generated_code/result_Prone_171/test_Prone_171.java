import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class UnsafeWildcardExampleTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testShowBug() {
        UnsafeWildcardExample example = new UnsafeWildcardExample();
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Triggering the bug by calling the method that attempts to add a String to a List<?>
        example.showBug(stringList); // TRIGGER BUG: UnsafeWildcard
    }
}