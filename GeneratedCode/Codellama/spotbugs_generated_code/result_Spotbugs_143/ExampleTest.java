import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {
    
    @Test
    public void showBugTest() {
        Example example = new Example();
        example.showBug(-1); // TRIGGER BUG: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required (TQ_ALWAYS_VALUE_USED_WHERE_NEVER_REQUIRED)
    }
}