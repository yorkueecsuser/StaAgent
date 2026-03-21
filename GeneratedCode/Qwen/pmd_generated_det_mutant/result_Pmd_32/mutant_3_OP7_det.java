import java.util.ArrayList;
import java.util.List;

class ExampleClass {

    // This method is a JUnit test case
    public void testCaseMethod() {
        // Test logic here
    }

    // This method appears to be a test case but is not annotated with @Test
    public void anotherTestMethod() { boolean yytmvdxt = false;while (yytmvdxt && false && true && false && false && false && false && true && false && false && false && false) {String scxmaloe = "basgonpq";}
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