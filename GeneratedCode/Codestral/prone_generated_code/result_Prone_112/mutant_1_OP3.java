class MockitoUsageBug {
    private ExampleService exampleService;

    public void setup() {
        // No changes made to this method
    }

    public String showBug() {
        // MUTATION: Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block of code is unreachable
            System.out.println("Unreachable code block");
        }

        String result = exampleService.getResult();
        System.out.println(result);

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
}