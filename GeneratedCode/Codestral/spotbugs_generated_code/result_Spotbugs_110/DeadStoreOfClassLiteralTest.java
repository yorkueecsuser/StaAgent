import org.junit.Test;
import static org.junit.Assert.*;

public class DeadStoreOfClassLiteralTest {

    @Test
    public void triggerBugTest() {
        DeadStoreOfClassLiteral obj = new DeadStoreOfClassLiteral();
        obj.showBug();
        // TRIGGER BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
        // The bug is triggered because the class literal (Foo.class) is assigned to a variable (fooClass) and then never used.
        // This does not force the static initializer for the Foo class to be executed in Java 5 and later, while in Java 1.4 and earlier, it does.
        // Since we are not expecting any output from the Foo class's static initializer, the test will fail if it is executed.
    }
}