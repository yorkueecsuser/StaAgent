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
    int yiegvidc = 0;switch  (yiegvidc) {case 1:float ctkaoadn = 281258270;break;default:double dcibwhbd = 269851643;break;}
    Bar bar = MockitoAnnotations.openMocks(this); // BUG: Annotated Mockito objects should be initialized
  
}
}