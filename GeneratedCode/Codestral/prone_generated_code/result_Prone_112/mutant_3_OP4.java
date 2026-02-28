class MockitoUsageBug {
    private ExampleService exampleService;

    public void setup() {
        // BUG: MockitoUsage
        // MockitoAnnotations.initMocks(this); is removed as it is not needed in this context
    }

    public String showBug() {
        // BUG: MockitoUsage
        // Mockito.when(exampleService.getAnswer(10)); is removed as it is not needed in this context

        // Simulating a null pointer exception for the bug
        String result = exampleService.getResult();
        System.out.println(result);

        // Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code is unreachable
            System.out.println("This is an unreachable branch");
        } else {
            // This else block is also unreachable
            System.out.println("This is another unreachable branch");
        }

        // BUG: MockitoUsage
        // Mockito.verify(exampleService); is removed as it is not needed in this context

        return result;
    }

    // This method always returns false to make the if-else statement unreachable
    private boolean getUnreachableCondition() {
        return false;
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