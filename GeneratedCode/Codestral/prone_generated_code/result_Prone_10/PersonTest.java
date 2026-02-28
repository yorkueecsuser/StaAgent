import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        String name = "John";
        int age = 30;

        // TRIGGER BUG: AutoValueConstructorOrderChecker
        String result = buggyCode.showBug(age, name);

        // Assert that the name and age are not swapped (since they are swapped in the buggy code)
        assertEquals(name + " is " + age + " years old.", result);
    }
}