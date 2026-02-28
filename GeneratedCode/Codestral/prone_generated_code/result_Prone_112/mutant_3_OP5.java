class MockitoUsageBug {
    private ExampleService exampleService;

    public void setup() {
        // Original code remains the same
    }

    public String showBug() {
        // Original code remains the same

        // Mutation: Unreachable switch statement
        int value = getUnreachableValue();  // Non-final method to get a value
        switch (value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
        }

        String result = exampleService.getResult();
        System.out.println(result);

        // Original code remains the same

        return result;
    }

    public static void main(String[] args) {
        MockitoUsageBug bug = new MockitoUsageBug();
        bug.setup();
        bug.showBug();
    }

    private static class ExampleService {
        public String getResult() {
            return "Result";
        }
    }

    // Non-final method to get a value always different from switch cases
    private int getUnreachableValue() {
        return 0;
    }
}