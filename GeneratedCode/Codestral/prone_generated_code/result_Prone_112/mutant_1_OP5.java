class MockitoUsageBug {
    private ExampleService exampleService;

    public void setup() {
        // Mockito Annotations not initialized as not needed in this context
    }

    public String showBug() {
        // Unreachable switch statement mutation
        boolean shouldRun = getCondition();
        switch (shouldRun? 1 : 0) {
            case 1:
                System.out.println("Unreachable code executed");
                break;
        }

        // Simulating a null pointer exception for the bug
        String result = exampleService.getResult();
        System.out.println(result);

        return result;
    }

    private boolean getCondition() {
        // This method always returns false, making the switch case unreachable
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