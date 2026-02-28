class MockitoUsageBug {
    private ExampleService a; // Mutated name: 'exampleService' renamed to 'a'

    public void setup() {
        // MockitoAnnotations.initMocks(this); is removed as it is not needed in this context
    }

    public String showBug() {
        // Mockito.when(exampleService.getAnswer(10)); is removed as it is not needed in this context

        // Simulating a null pointer exception for the bug
        String b = a.getResult(); // Mutated name:'result' renamed to 'b'
        System.out.println(b);

        // Mockito.verify(exampleService); is removed as it is not needed in this context

        return b;
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