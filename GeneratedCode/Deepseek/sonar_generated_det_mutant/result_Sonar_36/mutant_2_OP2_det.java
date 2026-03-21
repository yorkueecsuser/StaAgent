import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class FooTest { // BUG: Annotated Mockito objects should be initialized
  @Mock
  private Bar bar;

  @Mock
  private Baz baz;

  public FooTest() {
    MockitoAnnotations.openMocks(this);
  }
public void showBug() {
    Bar bar = MockitoAnnotations.openMocks(this);
    bar = MockitoAnnotations.openMocks(this);
}
}