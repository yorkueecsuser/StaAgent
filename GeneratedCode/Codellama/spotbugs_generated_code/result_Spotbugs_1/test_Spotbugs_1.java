import org.junit.Test;
import static org.junit.Assert.*;

public class OverridingMethodsMustInvokeSuperTest {
    @Test
    public void testBug() {
        Animal animal = new Dog();
        animal.makeSound();
        // TRIGGER BUG: CN: Super method is annotated with @OverridingMethodsMustInvokeSuper, but the overriding method isn’t calling the super method. (OVERRIDING_METHODS_MUST_INVOKE_SUPER)
    }
}