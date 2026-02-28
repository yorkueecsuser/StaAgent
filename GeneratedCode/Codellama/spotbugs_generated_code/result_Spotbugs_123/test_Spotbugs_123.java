import org.junit.Test;
import static org.junit.Assert.*;

public class BC_IMPOSSIBLE_INSTANCEOFTest {
  @Test
  public void testBug() {
    String[] arr = {"Hello", "World"};
    BC_IMPOSSIBLE_INSTANCEOF.showBug(arr);
  }
}