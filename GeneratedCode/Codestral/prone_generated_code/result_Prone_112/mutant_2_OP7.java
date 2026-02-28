import org.mockito.Mock; // ensure Mockito library is imported

class MockitoUsageBug {
    @Mock
    private ExampleService exampleService;

    public void setup() {
        // no changes to this method
    }

    public String showBug() {
        // Mutant: Unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This code will never be reached
            System.out.println("This is an unreachable while loop");
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

    // Simulating ExampleService for the demonstration of the bug
    private static class ExampleService {
        public String getResult() {
            return "Result";
        }
    }
}