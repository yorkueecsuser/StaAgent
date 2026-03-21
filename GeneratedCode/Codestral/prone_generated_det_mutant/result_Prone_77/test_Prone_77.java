import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    // TRIGGER BUG: InjectMoreThanOneScopeAnnotationOnClass
    public void testShowBug() {
        BuggyClass buggyObj = new BuggyClass();
        buggyObj.showBug();
        // As the BuggyClass is annotated with more than one scope annotation,
        // which is against the JSR-330 specification, this test case will fail at runtime.
    }
}