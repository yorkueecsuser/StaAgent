import org.junit.Test;
import static org.junit.Assert.*;

public class UnreachableCodeExampleTest {

    @Test
    public void testUnreachableIfBlock() {
        UnreachableCodeExample example = new UnreachableCodeExample();
        example.showBug(); // TRIGGER BUG: Conditionally executed code should be reachable
        fail("This test should fail because the unreachable code should be triggered"); // This line ensures the test fails
    }
}