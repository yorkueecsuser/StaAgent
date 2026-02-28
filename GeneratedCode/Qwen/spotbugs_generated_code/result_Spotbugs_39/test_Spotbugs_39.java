import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleClassTest {

    @Test
    public void testEqualMethod() {
        ExampleClass obj1 = new ExampleClass(10);
        ExampleClass obj2 = new ExampleClass(10);
        obj1.showBug(obj2); // TRIGGER BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
    }

    @Test
    public void testEqualMethodWithDifferentValues() {
        ExampleClass obj1 = new ExampleClass(10);
        ExampleClass obj2 = new ExampleClass(20);
        obj1.showBug(obj2); // TRIGGER BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
    }

    @Test
    public void testEqualMethodWithNull() {
        ExampleClass obj1 = new ExampleClass(10);
        ExampleClass obj2 = null;
        obj1.showBug(obj2); // TRIGGER BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
    }
}