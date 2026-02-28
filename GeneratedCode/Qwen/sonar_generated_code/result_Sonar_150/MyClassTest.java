import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testEqualsWithDifferentType() {
        MyClass myClass = new MyClass(10);
        myClass.showBug(new Integer(10)); // TRIGGER BUG: "equals(Object obj)" should test the argument's type
    }
}