import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsBugExampleTest {

    @Test
    public void testShowBug() {
        SubClass sb1 = new SubClass(10, "example");
        SubClass sb2 = new SubClass(10, "example");
        assertTrue(sb1.equals(sb2)); // This will use the correct equals method

        sb1.showBug(); // TRIGGER BUG: Eq: equals() method defined that doesn’t override equals(Object) (EQ_OTHER_NO_OBJECT)
    }
}