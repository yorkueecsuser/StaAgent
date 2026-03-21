import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    MyClass myClass = new MyClass();

    @Test
    public void testBugTrigger() {
        myClass.showBug();  // TRIGGER BUG: "getClass" should not be used for synchronization
    }
}