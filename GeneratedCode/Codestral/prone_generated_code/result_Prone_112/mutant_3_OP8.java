class MockitoUsageBug {
    private ExampleService x; // Mutated: Renamed 'exampleService' to 'x'

    public void setup() {
        // MockitoAnnotations.initMocks(this); is removed as it is not needed in this context
    }

    public String showBug() {
        // Mockito.when(exampleService.getAnswer(10)); is removed as it is not needed in this context

        // Simulating a null pointer exception for the bug
        String result = x.getResult(); // Mutated: Used the renamed variable 'x'
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