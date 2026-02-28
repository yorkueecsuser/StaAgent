import org.junit.Test;
import static org.junit.Assert.*;

public class MyInterfaceTest {
    @Test
    public void testShowBug() {
        MyClass myClass = new MyClass();
        myClass.showBug();
        // TRIGGER BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
        assertEquals(2, MyInterface.MY_ARRAY.size());
    }
}