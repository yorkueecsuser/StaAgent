import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class TypeQualifierBugTest {

    @Test
    public void testShowBugWithMixedList() {
        TypeQualifierBug bugDemo = new TypeQualifierBug();
        List<Object> mixedList = new ArrayList<>();
        mixedList.add("Hello");
        mixedList.add("World");
        mixedList.add(123); // Intentionally adding an Integer to demonstrate the bug

        bugDemo.showBug(mixedList); // TRIGGER BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
    }
}