import org.junit.Ignore;

class ExampleJUnit4Test {

    // This looks like a test method but is not annotated with @Test
    public void exampleTestMethod() { // BUG: JUnit4TestNotRun
        System.out.println("This should be a test method but is not annotated.");
    }

    // The public method to demonstrate the bug
    public void showBug() {
        exampleTestMethod();
    }
}