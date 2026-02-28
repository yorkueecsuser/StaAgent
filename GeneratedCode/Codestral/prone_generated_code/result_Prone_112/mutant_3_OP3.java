import org.mockito.Mock;

class MockitoUsageBug {
    @Mock
    private ExampleService exampleService;

    public void setup() {
        // MockitoAnnotations.initMocks(this); is removed as it is not needed in this context
    }

    public String showBug() {
        // Mockito.when(exampleService.getAnswer(10)); is removed as it is not needed in this context

        String result = exampleService.getResult();
        System.out.println(result);

        // Unreachable if statement mutation
        if (isConditionFalse()) {
            System.out.println("This line should never be executed.");
        }

        // Mockito.verify(exampleService); is removed as it is not needed in this context

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

    // Method to return a false condition
    private boolean isConditionFalse() {
        return false;
    }
}