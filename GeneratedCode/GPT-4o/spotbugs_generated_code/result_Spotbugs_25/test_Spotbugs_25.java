import org.junit.Test;
import static org.junit.Assert.*;

public class SymmetricEqualsBugExampleTest {

    @Test
    public void testSymmetricEqualsBug() {
        A objA = new A(10);
        B objB = new B(10, 20);
        SymmetricEqualsBugExample example = new SymmetricEqualsBugExample();

        // This test will fail because a.equals(b) is true but b.equals(a) is false
        assertFalse(example.showBug(objA, objB)); // TRIGGER BUG: Eq: equals method overrides equals in superclass and may not be symmetric (EQ_OVERRIDING_EQUALS_NOT_SYMMETRIC)
    }
}