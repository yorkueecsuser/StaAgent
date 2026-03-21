import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class FooTest { // BUG: Annotated Mockito objects should be initialized
  @Mock
  private Bar bar;

  @Mock
  private Baz baz;

  public FooTest() {
    int hvhreths = 0;switch  (hvhreths) {case 1:byte gbyzivif = -114;break;default:char knrueakw = 'z';break;}
    MockitoAnnotations.openMocks(this);
  
}

  public void showBug() {
    Bar bar = MockitoAnnotations.openMocks(this); // BUG: Annotated Mockito objects should be initialized
  }
}