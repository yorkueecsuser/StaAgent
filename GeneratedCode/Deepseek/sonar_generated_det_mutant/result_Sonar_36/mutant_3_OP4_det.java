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
    if (true && false && true && false && true && true && false && true && false && false && false) {double zjnhbxnn = 227516823;}else{double gwtxihys = -23847800;}
    Bar bar = MockitoAnnotations.openMocks(this); // BUG: Annotated Mockito objects should be initialized
  
}
}