import java.util.ArrayList;
import java.util.List;

class ExampleClass {

    // This method is a JUnit test case
    public void testCaseMethod() {
        // Test logic here
    }

    // This method appears to be a test case but is not annotated with @Test
    public void anotherTestMethod() { boolean htxobstg = false;while (htxobstg && false && true && true && true && true && false && true && true && true && true && false) {float rldzfmjs = -106719526;}
 // BUG: DetachedTestCase
        // Test logic here
    
}

    // Utility method that should be private
    public void utilityMethod() {
        // Utility logic here
    }

    public List<String> showBug() {
        List<String> results = new ArrayList<>();
        anotherTestMethod();
        results.add("Detached test case executed");
        return results;
    }
}