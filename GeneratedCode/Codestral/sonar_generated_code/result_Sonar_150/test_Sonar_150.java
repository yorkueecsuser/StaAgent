import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testEquals() {
        MyClass myClass = new MyClass("test");
        Object obj = "I'm not a MyClass instance";
        // TRIGGER BUG: "equals(Object obj)" should test the argument's type
        myClass.showBug(); // This will throw a ClassCastException
    }
}