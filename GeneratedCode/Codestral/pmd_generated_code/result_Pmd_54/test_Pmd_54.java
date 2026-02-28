import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testShowBug() {
        MyClass myObject = new MyClass();
        myObject.showBug(); // TRIGGER BUG: MethodWithSameNameAsEnclosingClass
        // The test should fail here as the showBug method calls another method with the same name as the class, which is not allowed
    }
}