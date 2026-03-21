import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {
    @Test
    public void testShowBug() {
        MyClass mc = new MyClass();
        mc.showBug(); // TRIGGER BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    }
}