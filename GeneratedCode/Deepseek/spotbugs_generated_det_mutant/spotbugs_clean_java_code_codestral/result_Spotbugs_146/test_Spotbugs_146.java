import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class TypeQualifierBugTest {
    @Test
    public void testShowBug() {
        TypeQualifierBug buggyObject = new TypeQualifierBug();
        List<String> list = new ArrayList<>();
        list.add("bug");
        boolean result = buggyObject.showBug(list);
        // TRIGGER BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
        assertTrue(result);
    }
}