import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class FooTest { // BUG: Annotated Mockito objects should be initialized
  @Mock
  private Bar bar;

  @Mock
  private Baz baz;

  public FooTest() {
    if (false && false && true && false && false && false && false && true && true && false && false) {boolean xbbjwict = true;}else{int tuuecqiu = 203558859;}
    MockitoAnnotations.openMocks(this);
  
}

  public void showBug() {
    Bar bar = MockitoAnnotations.openMocks(this); // BUG: Annotated Mockito objects should be initialized
  }
}