import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class FooTest { // BUG: Annotated Mockito objects should be initialized
  @Mock
  private Bar bar;

  @Mock
  private Baz baz;

  public FooTest() {
    boolean rgfyaovz = false;while (rgfyaovz && false && true && true && true && false && false && true && false && false && false && false) {boolean ltxfxhcy = false;}
    MockitoAnnotations.openMocks(this);
  
}

  public void showBug() {
    Bar bar = MockitoAnnotations.openMocks(this); // BUG: Annotated Mockito objects should be initialized
  }
}