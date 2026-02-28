import org.junit.Test;
import static org.junit.Assert.*;

class DangerousLiteralNullTest {
  @Test
  public void testBugTrigger() {
    DangerousLiteralNull obj = new DangerousLiteralNull();
    obj.main(null); // TRIGGER BUG: DangerousLiteralNull
  }
}