import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testEqualsWithDifferentType() {
        MyClass obj1 = new MyClass(10);
        String obj2 = "NotAMyClassObject";

        boolean result = obj1.showBug(obj2); // TRIGGER BUG: "equals(Object obj)" should test the argument's type
    }
}