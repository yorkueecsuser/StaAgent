import org.junit.Test;
import static org.junit.Assert.*;

public class NullableInjectedFieldsExampleTest {

    @Test
    public void testShowBugWithoutDefaultValue() {
        // Setting up the scenario where 'app.importantProperty' is not defined
        System.clearProperty("app.importantProperty");
        
        NullableInjectedFieldsExample example = new NullableInjectedFieldsExample();
        example.showBug(); // TRIGGER BUG: Nullable injected fields and parameters should provide a default value
    }
}