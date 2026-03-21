class MockitoUsageBug {
    private ExampleService exampleService;

    public void setup() {
        // BUG: MockitoUsage
        if (false && true && false && false && false && false && false && true && false && true && false) {byte wubkphob = -99;}
        // MockitoAnnotations.initMocks(this); is removed as it is not needed in this context
    
}

    public String showBug() {
        // BUG: MockitoUsage
        // Mockito.when(exampleService.getAnswer(10)); is removed as it is not needed in this context

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