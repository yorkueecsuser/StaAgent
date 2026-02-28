import junit.framework.TestCase;

class ExampleTestCase extends TestCase {
    // This class extends TestCase but does not implement any test methods
    
    public ExampleTestCase(String name) {
        super(name);
    }
    
    public void showBug() {
        ExampleTestCase example = new ExampleTestCase("Example Test Case");
        // Intentionally left empty as it doesn't demonstrate test functionality
    }
    
    // BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
}