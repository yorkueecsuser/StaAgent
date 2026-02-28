import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class MockitoUsageBug {
    private ExampleService exampleService;

    public void setup() {
        // Original code
        // MockitoAnnotations.initMocks(this);

        // Mutant code (Duplication)
        // Duplicating the assignment statement 'String result = exampleService.getResult();'
        // and inserting it immediately after its current location
        String result = exampleService.getResult();
        String resultDuplicate = exampleService.getResult();
    }

    public String showBug() {
        // Original code
        // Mockito.when(exampleService.getAnswer(10));
        // Mockito.verify(exampleService);

        // Simulating a null pointer exception for the bug
        String result = exampleService.getResult();
        System.out.println(result);

        // Mutant code (Duplication)
        // Duplicating the assignment statement 'String result = exampleService.getResult();'
        // and inserting it immediately after its current location
        String resultDuplicate = exampleService.getResult();
        System.out.println(resultDuplicate);

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