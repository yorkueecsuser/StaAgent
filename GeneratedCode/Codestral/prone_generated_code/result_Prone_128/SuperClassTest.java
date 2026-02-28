import org.junit.Test;
import static org.junit.Assert.*;

public class SubClassTest {
    @Test
    public void testOverridesJavaxInjectableMethod() {
        SubClass subClass = new SubClass();
        subClass.showBug();
        assertEquals("Initialized by subclass", subClass.getPostInitMessage());
        // TRIGGER BUG: OverridesJavaxInjectableMethod - The test will fail because the postInitialize() method in SubClass doesn't have the @Inject annotation.
        // This is demonstrated by the fact that the postInitMessage is not "Initialized by injector" as expected, but "Initialized by subclass" instead.
    }
}