import org.junit.Test;
import static org.junit.Assert.*;

public class MultiConstructorAutowiredBugTest {

    @Test
    public void testShowBug() {
        String input = "Test";
        int number = 42;

        // This line will trigger the bug because of ambiguity in constructor selection
        MultiConstructorAutowiredBug obj = new MultiConstructorAutowiredBug(input, number); // TRIGGER BUG: "@Autowired" should only be used on a single constructor

        String result = obj.showBug(input, number);
        assertEquals("Dependency1: Test, Dependency2: 42", result);
    }

    @Test
    public void testShowBugWithDifferentInput() {
        String input = "AnotherTest";
        int number = 99;

        // This line will also trigger the bug
        MultiConstructorAutowiredBug obj = new MultiConstructorAutowiredBug(input, number); // TRIGGER BUG: "@Autowired" should only be used on a single constructor

        String result = obj.showBug(input, number);
        assertEquals("Dependency1: AnotherTest, Dependency2: 99", result);
    }
}