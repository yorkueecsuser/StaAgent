import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {
    @Test
    public void showBugTest() {
        MyClass obj = new MyClass();
        obj.showBug(); // TRIGGER BUG: Incomparable
    }
}