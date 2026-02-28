import org.junit.Test;
import static org.junit.Assert.*;

class SpELBugTest {
    @Test
    void testShowBug() {
        String name = "John";
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    }

    @Test
    void testShowBugWithInvalidSpelExpression() {
        String name = "John";
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    }
}