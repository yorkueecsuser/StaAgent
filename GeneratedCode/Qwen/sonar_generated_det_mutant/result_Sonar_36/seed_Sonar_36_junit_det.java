import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.InjectMocks;

class FooExample {

    @Mock
    private Bar bar; // BUG: Annotated Mockito objects should be initialized

    @Spy
    private Baz baz; // BUG: Annotated Mockito objects should be initialized

    @InjectMocks
    private Foo fooUnderTest; // BUG: Annotated Mockito objects should be initialized

    @Before
    public void setUp() {
        // Intentionally left empty to demonstrate the bug
    }

    @BeforeEach
    public void setUpJupiter() {
        // Intentionally left empty to demonstrate the bug
    }

    public String showBug() {
        // This method attempts to use the uninitialized mocks
        bar.doSomething();
        baz.doSomethingElse();
        return fooUnderTest.useBarAndBaz();
    }

    public static class Bar {
        public void doSomething() {
            // Method implementation
        }
    }

    public static class Baz {
        public void doSomethingElse() {
            // Method implementation
        }
    }

    public static class Foo {
        private Bar bar;
        private Baz baz;

        public Foo(Bar bar, Baz baz) {
            this.bar = bar;
            this.baz = baz;
        }

        public String useBarAndBaz() {
            bar.doSomething();
            baz.doSomethingElse();
            return "Used Bar and Baz";
        }
    }
}