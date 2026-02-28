import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testShowBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        myClass.showBug(); // TRIGGER BUG: CloneMethodMustImplementCloneable
    }
}