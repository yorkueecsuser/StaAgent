import org.junit.Test;
import static org.junit.Assert.*;

public class ClassNameEqualityBugTest {

    @Test
    public void testShowBug() {
        ClassNameEqualityBug bug1 = new ClassNameEqualityBug("Bug1");
        ClassNameEqualityBug bug2 = new ClassNameEqualityBug("Bug1");
        bug1.showBug(); // TRIGGER BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
    }
}