import org.mockito.Mock; // Import necessary for Mockito
import org.mockito.MockitoAnnotations;

class UninitializedMocksExample {
    // BUG: Annotated Mockito objects should be initialized
    @Mock
    private Bar bar; // Now, Bar is a Mockito mock, which needs to be initialized

    public void showBug() {
        MockitoAnnotations.initMocks(this); // Initialize Mockito mocks
        bar.someMethod(); // Duplicate the initialization statement and insert after it
        bar.someMethod(); // This will duplicate the method call on 'bar', simulating the 'Duplication' mutation operator
        throw new NullPointerException("Bar is not initialized");
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}