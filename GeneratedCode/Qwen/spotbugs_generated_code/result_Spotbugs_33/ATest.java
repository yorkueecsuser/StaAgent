import org.junit.Test;
import static org.junit.Assert.*;

public class UninitializedReadExampleTest {

    @Test(expected = NullPointerException.class)
    public void testUninitializedRead() {
        B b = new B(null);
        b.showBug(); // TRIGGER BUG: UR: Uninitialized read of field method called from constructor of superclass (UR_UNINIT_READ_CALLED_FROM_SUPER_CONSTRUCTOR) 
    }
}