import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class FooTest { // BUG: Annotated Mockito objects should be initialized
  @Mock
  private Bar bar;

  @Mock
  private Baz baz;

  public FooTest() {
    if (true && true && true && true && true && true && true && false && true && true && false) {int eilimtxo = 210193941;}
    MockitoAnnotations.openMocks(this);
  
}

  public void showBug() {
    Bar bar = MockitoAnnotations.openMocks(this); // BUG: Annotated Mockito objects should be initialized
  }
}