import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexOfBugTest {

    @Test
    public void testShowBug1() {
        StringIndexOfBug bugDemo = new StringIndexOfBug();
        bugDemo.showBug1("HelloWorld", "o", 7, 5); // TRIGGER BUG: "String.indexOf" should be used with correct ranges
    }

    @Test
    public void testShowBug2() {
        StringIndexOfBug bugDemo = new StringIndexOfBug();
        bugDemo.showBug2("HelloWorld", "o", -1, 5); // TRIGGER BUG: "String.indexOf" should be used with correct ranges
    }
}