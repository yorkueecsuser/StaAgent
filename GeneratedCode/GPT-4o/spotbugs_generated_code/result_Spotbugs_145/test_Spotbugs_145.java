import org.junit.Test;
import static org.junit.Assert.*;

public class TypeQualifierBugDemoTest {

    @Test
    public void testShowBug() {
        TypeQualifierBugDemo demo = new TypeQualifierBugDemo();
        demo.showBug(); // TRIGGER BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
    }
}