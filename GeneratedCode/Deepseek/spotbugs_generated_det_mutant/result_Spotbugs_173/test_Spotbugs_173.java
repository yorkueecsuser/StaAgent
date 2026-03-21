import org.junit.*;
import static org.junit.Assert.*;

public class FinExampleTest {
  FinExample fe;
  
  @Before
  public void setUp() {
    fe = new FinExample(); 
  }
  
  @Test
  public void testBugTrigger() {
    fe.showBug(); // TRIGGER BUG: FI: Finalizer should be protected, not public (FI_PUBLIC_SHOULD_BE_PROTECTED)
  }
}