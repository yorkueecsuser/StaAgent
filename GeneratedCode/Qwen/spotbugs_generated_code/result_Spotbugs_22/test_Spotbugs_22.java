import org.junit.Test;
import static org.junit.Assert.*;

public class ClassNameEqualityBugTest {

    @Test
    public void testEqualsWithSameClassNamesButDifferentObjects() {
        ClassNameEqualityBug bug1 = new ClassNameEqualityBug("Example");
        ClassNameEqualityBug bug2 = new ClassNameEqualityBug("AnotherExample");
        
        // The showBug method internally calls the equals method which triggers the bug
        assertEquals("Are the objects equal? true", bug1.showBug(bug2)); // TRIGGER BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES) 
    }
}