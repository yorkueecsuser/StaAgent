class MockitoUsageBug {
    private ExampleService exampleService;

    public void setup() {
        exampleService = new ExampleService();
        exampleService = new ExampleService(); // Duplication of the assignment statement
        // MockitoAnnotations.initMocks(this); is removed as it is not needed in this context
    }

    public String showBug() {
        // Mockito.when(exampleService.getAnswer(10)); is removed as it is not needed in this context

        // Simulating a null pointer exception for the bug
        String result = exampleService.getResult();
        String resultDuplicate = exampleService.getResult(); // Duplication of the assignment statement
        System.out.println(result);

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