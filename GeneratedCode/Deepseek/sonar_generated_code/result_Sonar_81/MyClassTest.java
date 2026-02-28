import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    private MyClass myClass = new MyClass();

    @Test
    public void showBugTest() {
        // TRIGGER BUG: "getClass" should not be used for synchronization
        myClass.showBug();
    }
}