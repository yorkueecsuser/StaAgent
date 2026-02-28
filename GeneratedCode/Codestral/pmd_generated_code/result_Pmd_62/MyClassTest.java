import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testShowBug() {
        MyClass obj = new MyClass();
        obj.showBug();
        // TRIGGER BUG: NonStaticInitializer - The bug is triggered when showBug() is called.
        // It creates a new instance of MyClass, which executes the non-static initializer block before the constructor.
    }
}