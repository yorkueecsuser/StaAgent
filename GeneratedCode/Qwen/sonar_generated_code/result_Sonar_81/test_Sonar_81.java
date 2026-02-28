import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testDoSomethingSynchronized() throws InterruptedException {
        MyClass myClass = new MyClass();
        int result = myClass.showBug(); // TRIGGER BUG: "getClass" should not be used for synchronization
        assertEquals(10000, result);
    }
}