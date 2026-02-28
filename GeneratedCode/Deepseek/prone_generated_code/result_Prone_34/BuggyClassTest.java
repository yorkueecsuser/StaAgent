import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

  @Test
  // TRIGGER BUG: DiscardedPostfixExpression
  public void testShowBug() {
    BuggyClass buggyClass = new BuggyClass();
    buggyClass.showBug();
  }
}