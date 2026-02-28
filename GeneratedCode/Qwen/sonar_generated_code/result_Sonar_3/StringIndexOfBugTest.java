import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexOfBugTest {

    private StringIndexOfBug bugDemo = new StringIndexOfBug();

    @Test
    public void testShowBug1() {
        bugDemo.showBug1("Hello World", "World", 7, 2); // TRIGGER BUG: "String.indexOf" should be used with correct ranges
    }

    @Test
    public void testShowBug2() {
        bugDemo.showBug2("Hello World", "World", -1, 5); // TRIGGER BUG: "String.indexOf" should be used with correct ranges
    }

    @Test
    public void testShowBug3() {
        bugDemo.showBug3("Hello World", "World", 12, 7); // TRIGGER BUG: "String.indexOf" should be used with correct ranges
    }
}