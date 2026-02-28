import org.junit.Test;
import static org.junit.Assert.*;

public class ChildTest {
    @Test
    public void testBugTrigger() {
        Parent parent = new Parent();
        parent.showBug();

        // TRIGGER BUG: Child class methods named for parent class methods should be overrides
        // The bug is triggered here because the Child's doSomething method is not an override of the parent method
        // due to using a different type of Pear (from the Fruit class) than the Parent's doSomething method (which uses a Pear from the Computer class).
        // Also, the Child's doSomethingElse method is not an override of the static parent method.
    }
}