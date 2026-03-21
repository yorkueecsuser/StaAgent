import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexOfBugDemoTest {

    @Test
    public void testShowBugWithInvalidRange() {
        StringIndexOfBugDemo demo = new StringIndexOfBugDemo();
        String text = "Hello, this is a sample string for testing.";
        String searchString = "sample";

        // TRIGGER BUG: "String.indexOf" should be used with correct ranges
        demo.showBug(text, searchString, 10, 30);
    }

    @Test
    public void testShowBugReversedRange() {
        StringIndexOfBugDemo demo = new StringIndexOfBugDemo();
        String text = "Hello, this is a sample string for testing.";
        String searchString = "sample";

        // TRIGGER BUG: "String.indexOf" should be used with correct ranges
        demo.showBug(text, searchString, 30, 10);
    }

    @Test
    public void testShowBugNegativeBeginIndex() {
        StringIndexOfBugDemo demo = new StringIndexOfBugDemo();
        String text = "Hello, this is a sample string for testing.";
        String searchString = "sample";

        // TRIGGER BUG: "String.indexOf" should be used with correct ranges
        demo.showBug(text, searchString, -1, 30);
    }
}