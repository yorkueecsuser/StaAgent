import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class MyClassTest {
    @Test
    // TRIGGER BUG: "equals(Object obj)" should test the argument's type
    public void testShowBug() {
        MyClass mc1 = new MyClass(5);
        ArrayList<Object> list = new ArrayList<>();
        list.add(new String("Bug"));

        mc1.showBug(mc1, list.get(0)); // This line triggers the bug
    }
}