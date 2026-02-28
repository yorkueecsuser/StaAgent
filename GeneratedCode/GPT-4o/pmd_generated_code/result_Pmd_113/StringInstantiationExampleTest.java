import org.junit.Test;
import static org.junit.Assert.*;

public class StringInstantiationExampleTest {

    @Test
    public void testShowBug() {
        StringInstantiationExample example = new StringInstantiationExample(); // TRIGGER BUG: StringInstantiation
        String result = example.showBug(); // TRIGGER BUG: StringInstantiation
        assertEquals("bar", result); // This will pass, but the bug is about unnecessary instantiation
    }

    @Test
    public void testStringInstantiationNotShared() {
        StringInstantiationExample example1 = new StringInstantiationExample(); // TRIGGER BUG: StringInstantiation
        StringInstantiationExample example2 = new StringInstantiationExample(); // TRIGGER BUG: StringInstantiation
        assertNotSame(example1.showBug(), example2.showBug()); // This should fail due to the bug
    }
}