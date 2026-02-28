class MockitoUsageBug {
    private ExampleService exampleService;

    public void setup() {
        // BUG: MockitoUsage
        // MockitoAnnotations.initMocks(this); is removed as it is not needed in this context
    }

    public String showBug() {
        // BUG: MockitoUsage
        // Mockito.when(exampleService.getAnswer(10)); is removed as it is not needed in this context

        // Add unreachable switch statement
        boolean condition = false;
        switch (condition) {
            case true:
                // This case will never be executed
                System.out.println("Unreachable code");
                break;
        }

        // Simulating a null pointer exception for the bug
        String result = exampleService.getResult();
        System.out.println(result);

        // BUG: MockitoUsage
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
}