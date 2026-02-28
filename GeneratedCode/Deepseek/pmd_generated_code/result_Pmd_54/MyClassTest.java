import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {
    
    MyClass myClass = new MyClass();

    @Test
    public void testMethodWithSameNameAsEnclosingClass() {
        // TRIGGER BUG: MethodWithSameNameAsEnclosingClass
        myClass.showBug();
    }
}