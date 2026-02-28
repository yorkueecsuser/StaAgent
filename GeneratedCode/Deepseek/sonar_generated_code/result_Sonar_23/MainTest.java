import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test // TRIGGER BUG: Cast operations should not trigger a ClassCastException
    public void testShowBug() {
        try {
            Main.showBug();
            fail("Expected ClassCastException to be thrown"); // TRIGGER BUG: Cast operations should not trigger a ClassCastException
        } catch (ClassCastException e) {
            // Expected exception, test passes
        }
    }

    private static class Parent {
    }

    private static class Child extends Parent {
        public void sayHello() {
            System.out.println("Hello, world!");
        }
    }
}