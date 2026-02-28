import org.junit.runner.RunWith;
import org.junit.runners.Enclosed;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
class EnclosedTestExample {

    public static class InnerTest {
        @Test
        public void exampleTest() {
            assertEquals(1, 1); // BUG: JUnit4TestsNotRunWithinEnclosed
        }
    }

    public static class BugDemonstrator {
        public String showBug() {
            // This method will demonstrate that the test is not run
            return "Inner tests are not executed with the Enclosed runner unless specifically handled.";
        }
    }
}