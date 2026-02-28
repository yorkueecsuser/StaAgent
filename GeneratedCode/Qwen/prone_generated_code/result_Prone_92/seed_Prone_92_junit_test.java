import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ExampleClass {

    public void intendedTestMethod() {
        // This method is intended to be a test but lacks the @Test annotation
        System.out.println("This method should be a test but it is not."); // BUG: JUnit4TestNotRun
    }

    public String showBug() {
        intendedTestMethod();
        return "Method intended to be a test was not executed.";
    }
}