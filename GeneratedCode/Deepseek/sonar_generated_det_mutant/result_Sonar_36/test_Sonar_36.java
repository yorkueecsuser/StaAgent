import org.junit.Test;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;

public class FooTest {
  @Mock
  private Bar bar;

  @Mock
  private Baz baz;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }

  @Test // TRIGGER BUG: Annotated Mockito objects should be initialized
  public void showBug() {
    bar.someMethod(); // Line 20, 'bar' is not initialized
    baz.someMethod(); // Line 21, 'baz' is not initialized
  }
}