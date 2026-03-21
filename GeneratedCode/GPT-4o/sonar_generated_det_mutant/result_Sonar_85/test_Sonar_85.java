import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexBugDemoTest {

    @Test
    public void testShowBug() {
        StringIndexBugDemo demo = new StringIndexBugDemo();
        demo.showBug(); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
    }
}

class StringIndexBugDemo {

    public void showBug() {
        String example = "Hello, World!";
        String result = example.substring(7, 20); // BUG: Indexes to passed to "String" operations should be within the string's bounds
        System.out.println(result);
    }

    public static void main(String[] args) {
        StringIndexBugDemo demo = new StringIndexBugDemo();
        demo.showBug();
    }
}