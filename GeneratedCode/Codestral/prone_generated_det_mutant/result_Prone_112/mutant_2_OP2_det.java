class MockitoUsageBug {
    private ExampleService exampleService;

    public void setup() {
        // BUG: MockitoUsage
        // MockitoAnnotations.initMocks(this); is removed as it is not needed in this context
    }
public String showBug() {
    String result = exampleService.getResult();
    result = exampleService.getResult();
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