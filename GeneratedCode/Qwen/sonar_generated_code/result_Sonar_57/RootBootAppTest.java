import org.junit.Test;
import static org.junit.Assert.*;

public class RootBootAppTest {

    @Test
    public void testShowBug() {
        RootBootApp app = new RootBootApp();
        String result = app.showBug(); // TRIGGER BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
        assertEquals("This method demonstrates the bug by being part of a class in the default package with @SpringBootApplication and @ComponentScan", result);
        fail("This test is expected to fail due to the misuse of @SpringBootApplication and @ComponentScan in the default package"); // TRIGGER BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
    }
}