import org.junit.Test;
import static org.junit.Assert.*;

public class AutoValueExampleTest {

    @Test
    public void testShowBug() {
        AutoValueExample example = new AutoValueExample("John Doe", 30);
        String result = example.showBug(25, "Jane Doe"); // TRIGGER BUG: AutoValueConstructorOrderChecker
        assertEquals("Name: Jane Doe, Age: 25", result); // TRIGGER BUG: AutoValueConstructorOrderChecker
    }
}