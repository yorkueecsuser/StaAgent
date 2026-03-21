import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FooTest {
    @Mock
    private Bar bar; // BUG: Annotated Mockito objects should be initialized

    @Test
    void someTest() {
        // test something...
    }

    public Object showBug() {
        return bar;
    }
}