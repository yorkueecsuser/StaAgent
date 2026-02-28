import org.junit.Test;
import static org.junit.Assert.*;

class InjectableClass {

    private String value;

    @Inject // BUG: MoreThanOneInjectableConstructor
    public InjectableClass(String value) {
        this.value = value;
    }

    @Inject // BUG: MoreThanOneInjectableConstructor
    public InjectableClass(int number) {
        this.value = String.valueOf(number);
    }

    public String showBug() {
        return value;
    }

    public static void main(String[] args) {
        InjectableClass obj1 = new InjectableClass("Hello");
        InjectableClass obj2 = new InjectableClass(123);
        System.out.println(obj1.showBug());
        System.out.println(obj2.showBug());
    }
}

public class InjectableClassTest {

    @Test
    public void testStringConstructor() {
        InjectableClass obj1 = new InjectableClass("Hello"); // TRIGGER BUG: MoreThanOneInjectableConstructor
        assertEquals("Hello", obj1.showBug());
    }

    @Test
    public void testIntConstructor() {
        InjectableClass obj2 = new InjectableClass(123); // TRIGGER BUG: MoreThanOneInjectableConstructor
        assertEquals("123", obj2.showBug());
    }
}