import org.junit.Test;
import static org.junit.Assert.*;

public class BTest {
    @Test
    // TRIGGER BUG: UR: Uninitialized read of field method called from constructor of superclass (UR_UNINIT_READ_CALLED_FROM_SUPER_CONSTRUCTOR)
    public void testUninitializedRead() {
        B b = new B("Test Value");
        b.showBug();
        // The bug is triggered during the construction of the B object, when the A constructor is called.
        // A's constructor calls the getValue method before B's constructor has initialized the 'value' field.
        // This results in reading the uninitialized 'value' field.
    }
}