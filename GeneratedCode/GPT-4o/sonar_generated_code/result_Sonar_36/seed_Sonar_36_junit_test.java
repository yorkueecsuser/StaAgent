import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.Test;

class ExampleTest { // BUG: Annotated Mockito objects should be initialized
    @Mock
    private Bar bar; // BUG: Annotated Mockito objects should be initialized

    @Spy
    private Baz baz; // BUG: Annotated Mockito objects should be initialized

    @InjectMocks
    private Foo fooUnderTest; // BUG: Annotated Mockito objects should be initialized

    @Test
    void someTest() {
        // Test logic here...
    }

    public void showBug() {
        someTest();
    }
}

class Bar {
    // Some methods and logic.
}

class Baz {
    // Some methods and logic.
}

class Foo {
    // Some methods and logic.
}