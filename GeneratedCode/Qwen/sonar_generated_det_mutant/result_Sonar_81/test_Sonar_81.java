import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testDoSomethingSynchronized() throws InterruptedException {
        MyClass myClass = new MyClass();
        myClass.showBug(10); // TRIGGER BUG: "getClass" should not be used for synchronization
    }
}