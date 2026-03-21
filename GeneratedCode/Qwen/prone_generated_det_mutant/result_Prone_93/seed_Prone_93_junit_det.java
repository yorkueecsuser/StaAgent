import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Enclosed;
import org.junit.Test;

@RunWith(Enclosed.class)
class ExampleEnclosed {

    public static class InnerClass {
        @Test
        public void exampleMethod() {
            System.out.println("This test will not run."); // BUG: JUnit4TestsNotRunWithinEnclosed
        }
    }

    public String showBug() {
        // This method is intended to demonstrate the bug, but due to the nature of the bug,
        // the test method will not run, so we return a placeholder string.
        return "Check the console; the test should not have run.";
    }
}