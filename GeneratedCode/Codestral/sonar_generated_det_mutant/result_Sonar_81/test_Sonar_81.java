import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testBugTrigger() {
        MyClass myClass = new MyClass();
        myClass.showBug(); // TRIGGER BUG: "getClass" should not be used for synchronization
    }
}