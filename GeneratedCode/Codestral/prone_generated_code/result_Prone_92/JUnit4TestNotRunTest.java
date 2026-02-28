import org.junit.Test;
import static org.junit.Assert.*;

public class JUnit4TestNotRunTest {

    @Test
    public void testShowBug() {
        JUnit4TestNotRun junitTest = new JUnit4TestNotRun();
        // TRIGGER BUG: JUnit4TestNotRun
        junitTest.showBug();
        // Since testMethodWithoutAnnotation() is not annotated with @Test, it will not be run.
        // However, showBug() calls testMethodWithoutAnnotation(), so this test case will pass without error.
        // In reality, we would expect this test case to fail because testMethodWithoutAnnotation() is not executed.
        // This demonstrates the JUnit4TestNotRun bug.
    }
}