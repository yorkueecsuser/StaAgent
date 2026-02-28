import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoStringFieldReferenceEqualityBugTest {

    @Test
    public void testShowBug() {
        ProtoStringFieldReferenceEqualityBug bug = new ProtoStringFieldReferenceEqualityBug();
        String name1 = "John Doe";
        String name2 = new String("John Doe");

        // TRIGGER BUG: ProtoStringFieldReferenceEquality
        assertFalse(bug.showBug(name1, name2));
    }
}