import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

class FooExample {

    @Mock
    private Bar bar; // BUG: Annotated Mockito objects should be initialized

    @Spy
    private Baz baz; // BUG: Annotated Mockito objects should be initialized

    @InjectMocks
    private Foo fooUnderTest; // BUG: Annotated Mockito objects should be initialized

    @Nested
    class NestedExample {
        @Mock
        private Bar nestedBar; // BUG: Annotated Mockito objects should be initialized
    }

    public void showBug() {
        // This method is intended to demonstrate the bug by attempting to use uninitialized mocks
        fooUnderTest.doSomething();
    }

    public static class Bar {
        public void doSomething() {
            System.out.println("Bar is doing something");
        }
    }

    public static class Baz {
        public void doSomethingElse() {
            System.out.println("Baz is doing something else");
        }
    }

    public static class Foo {
        private Bar bar;
        private Baz baz;

        public void doSomething() {
            bar.doSomething();
            baz.doSomethingElse();
        }
    }
}