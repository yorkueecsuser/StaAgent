class MockitoUsageBug {
    private ExampleService exampleService;

    public void setup() {
        // Mockito annotations were not removed in the original code
    }

    public String showBug() {
        // Unreachable while loop mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable loop");
        }

        // Simulating a null pointer exception for the bug
        String result = exampleService.getResult();
        System.out.println(result);

        // Mockito verification was not removed in the original code

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

    // Method to return a condition for the while loop
    private boolean getCondition() {
        return false;
    }
}