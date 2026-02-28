import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testEqualsHashCodeBug() {
        Person.showBug(); // TRIGGER BUG: EqualsHashCode
        // This test should fail because Person class does not override hashCode() method,
        // which causes the equals() method to not behave correctly when used in a HashSet.
        // The expected size of the HashSet is 1, but it will be 2 due to the bug.
    }
}