import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testShowBug() {
        MyClass myClassInstance = new MyClass();
        assertEquals("Method with same name as class called", myClassInstance.showBug()); // TRIGGER BUG: MethodWithSameNameAsEnclosingClass
    }
}