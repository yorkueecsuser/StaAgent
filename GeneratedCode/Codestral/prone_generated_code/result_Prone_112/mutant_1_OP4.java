class MockitoUsageBug {
    private ExampleService exampleService;

    public void setup() {
        // No change needed here
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug() {
        if (getUnreachableCondition()) {
            // Unreachable code branch
            throw new RuntimeException("This branch should never be executed");
        } else {
            // Original code remains unchanged
            String result = exampleService.getResult();
            System.out.println(result);
            return result;
        }
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