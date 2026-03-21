import org.junit.Test;
import static org.junit.Assert.*;

public class NullableValueInjectionBugTest {

    @Test
    public void showBugTest() {
        NullableValueInjectionBug buggyObject = new NullableValueInjectionBug();
        buggyObject.showBug(); // TRIGGER BUG: Nullable injected fields and parameters should provide a default value
    }
}