import org.junit.Test;
import static org.junit.Assert.*;

public class DerivedClassTest {

    @Test
    public void testShowBug() {
        DerivedClass dc = new DerivedClass();
        String result = dc.showBug(); // TRIGGER BUG: CN: Super method is annotated with @OverridingMethodsMustInvokeSuper, but the overriding method isn’t calling the super method. (OVERRIDING_METHODS_MUST_INVOKE_SUPER)
        
        // This test is expected to fail because the bug is present
        assertEquals("Expected BaseClass's importantMethod to be called.", 
                     "BaseClass: Important tasks are being performed.\nDerivedClass: Overridden method without calling super.\nBug demonstrated: Overriding method did not call super method.", 
                     result); // TRIGGER BUG: CN: Super method is annotated with @OverridingMethodsMustInvokeSuper, but the overriding method isn’t calling the super method. (OVERRIDING_METHODS_MUST_INVOKE_SUPER)
    }
}