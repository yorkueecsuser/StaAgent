import org.junit.Test;
import static org.junit.Assert.*;

public class IncompatibleArrayCompareBugTest {
  @Test
  public void testIncompatibleArrayCompareBug() {
    String[] strArr1 = {"hello", "world"};
    StringBuffer[] strBufArr2 = {new StringBuffer("hello"), new StringBuffer("world")};
    assertFalse(strArr1.equals(strBufArr2)); // TRIGGER BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
  }
}