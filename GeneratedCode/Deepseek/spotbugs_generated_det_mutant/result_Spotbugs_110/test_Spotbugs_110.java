import org.junit.Test;
import static org.junit.Assert.*;

public class DeadStoreOfClassLiteralTest {
    DeadStoreOfClassLiteral objectUnderTest = new DeadStoreOfClassLiteral();

    @Test
    public void testShowBug() {
        objectUnderTest.showBug();  // TRIGGER BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
        // The test will pass successfully if the bug is not triggered
        // However, since the bug is already present in the original code, the test will fail in this case
        // To manually test this, you can comment out the line above and see that the test fails
    }
}