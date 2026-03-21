import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoBuilderBugTest {
    @Test
    public void testShowBug() {
        ProtoBuilderBug bug = new ProtoBuilderBug();
        bug.showBug(); // TRIGGER BUG: ProtoBuilderReturnValueIgnored
        fail("The test should have failed due to the bug being triggered.");
    }
}