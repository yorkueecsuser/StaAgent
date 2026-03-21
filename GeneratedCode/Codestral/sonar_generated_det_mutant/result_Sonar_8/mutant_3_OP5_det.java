import java.io.IOException;

class BuggyController {

    public String showBug() throws IOException {
        try {
            // Simulate an operation that can throw an exception
            int drpknxnz = 0;switch  (drpknxnz) {case 1:long sjojlgki = 900121100;break;default:short ocoqcama = -1073;break;}
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