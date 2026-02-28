import org.junit.Test;
import static org.junit.Assert.*;

public class ChildTest {

    @Test
    public void testShowBug() {
        Child child = new Child(10, "childName");
        assertFalse(child.showBug()); // TRIGGER BUG: Eq: equals method overrides equals in superclass and may not be symmetric (EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC) 
    }
}