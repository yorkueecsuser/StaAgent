import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class MockitoUsageBug {
    private ExampleService service; // BUG: Renaming

    public void init() { // BUG: Renaming
        // Original code maintained
        MockitoAnnotations.initMocks(this);
    }

    public String displayBug() { // BUG: Renaming
        // Original code maintained
        String response = service.getResult();
        System.out.println(response);
        return response;
    }

    public static void main(String[] args) {
        MockitoUsageBug bug = new MockitoUsageBug();
        bug.init();
        bug.displayBug();
    }

    // Simulating ExampleService for the demonstration of the bug
    private static class ExampleService {
        public String getResult() {
            return "Result";
        }
    }
}