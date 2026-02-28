import org.junit.Test;

public class DerivedTest {

    @Test
    public void testShowBug() {
        Derived derived = new Derived();
        derived.showBug(); // TRIGGER BUG: CN: Super method is annotated with @OverridingMethodsMustInvokeSuper, but the overriding method isn’t calling the super method. (OVERRIDING_METHODS_MUST_INVOKE_SUPER) 
    }
}