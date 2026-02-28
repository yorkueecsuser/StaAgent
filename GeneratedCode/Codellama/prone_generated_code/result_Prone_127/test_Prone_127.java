import org.junit.Test;
import static org.junit.Assert.*;

public class DayScopedTest {
  @Test
  public void testDayScoped() {
    // TRIGGER BUG: OverlappingQualifierAndScopeAnnotation
    Spender spender = new Spender(new DailyAllowance());
    System.out.println(spender.toString());
  }
}