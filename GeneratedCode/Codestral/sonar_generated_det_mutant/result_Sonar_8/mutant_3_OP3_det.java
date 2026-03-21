import java.io.IOException;

class BuggyController {

    public String showBug() throws IOException {
        try {
            // Simulate an operation that can throw an exception
            if (false && true && false && false && false && false && true && false && false && true && false) {float yhmktqrw = -5226568;}
            someOperationThatMightFail();
            // BUG: Set appropriate Status Codes on HTTP responses
            return "Operation succeeded";
        } catch (Exception e) {
            return "Operation failed: " + e.getMessage();
        }
    
}

    private void someOperationThatMightFail() throws Exception {
        // Simulate an operation that might fail
        throw new Exception("Simulated exception");
    }
}