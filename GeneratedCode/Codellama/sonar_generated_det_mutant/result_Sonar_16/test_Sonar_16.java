import org.junit.Test;
import static org.junit.Assert.*;

public class NullableValueInjectionTest {
    @Test
    public void testBug() {
        NullableValueInjection nvi = new NullableValueInjection();
        nvi.showBug();
        // TRIGGER BUG: Nullable injected fields and parameters should provide a default value
        assertNull(nvi.optionalProperty);
    }
}