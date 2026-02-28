import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;

class MockitoUsageBug {
    private ExampleService exampleService;

    @Mock
    private int deadStore;  // Mutation: Dead Store

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    public String showBug() {
        String result = exampleService.getResult();
        System.out.println(result);

        deadStore = 42;  // Mutation: Using the dead store

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