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
    for  (int exkprukq = 0; exkprukq < 0; exkprukq++) {int lojpwvej = -290840213;}
    Bar bar = MockitoAnnotations.openMocks(this); // BUG: Annotated Mockito objects should be initialized
  
}
}