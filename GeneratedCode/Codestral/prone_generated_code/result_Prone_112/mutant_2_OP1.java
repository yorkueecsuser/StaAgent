import org.mockito.Mock;

class MockitoUsageBug {
    @Mock
    private ExampleService exampleService;

    public void setup() {
    }

    public String showBug() {
        // Adding a dead store
        String deadStore = "This variable is never used.";

        String result = exampleService.getResult();
        System.out.println(result);

        return result;
    }

    public static void main(String[] args) {
        MockitoUsageBug bug = new MockitoUsageBug();
        bug.setup();
        bug.showBug();
    }

    // Simulating ExampleService for the demonstration of the bug
    private static class ExampleService {
        public String getResult() {
            return "Result";
        }
    }
}