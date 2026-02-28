import org.junit.Test;
import static org.junit.Assert.*;
import computer.Pear;

class ChildTest {
    @Test
    public void testBug() {
        Child child = new Child();
        child.showBug();
        // TRIGGER BUG: Child class methods named for parent class methods should be overrides
    }
}