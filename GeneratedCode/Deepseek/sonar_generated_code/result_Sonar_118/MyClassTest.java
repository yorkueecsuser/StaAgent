import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void test_doSomething() {
        MyClass myClass = new MyClass();
        myClass.setInitialized(false); // Trigger bug: Locks should be released on all paths
        myClass.showBug(); // TRIGGER BUG: Locks should be released on all paths
    }
}