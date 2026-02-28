import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.math.BigDecimal;
import junit.framework.Assert;
import org.junit.Test;

class Bug3474679 {
  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals1() {
    boolean conditionWhile1 = getCondition();
    while (conditionWhile1) {
      // Unreachable code
    }
    Assert.assertEquals(new Double(0), new BigDecimal("0")); // correctly flagged as a bug
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals2() {
    boolean conditionWhile2 = getCondition();
    while (conditionWhile2) {
      // Unreachable code
    }
    Assert.assertEquals(new Double(0), new CustomObject()); // identical bug type is missed
  }

  @NoWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals2a() {
    boolean conditionWhile3 = getCondition();
    while (conditionWhile3) {
      // Unreachable code
    }
    Assert.assertFalse(new Double(0).equals(new CustomObject()));
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals3() {
    boolean conditionWhile4 = getCondition();
    while (conditionWhile4) {
      // Unreachable code
    }
    if (new Double(0).equals(new BigDecimal("0"))) // correctly flagged as a bug
    System.out.println("huh");
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals4() {
    boolean conditionWhile5 = getCondition();
    while (conditionWhile5) {
      // Unreachable code
    }
    if (new Double(0).equals(new CustomObject())) // identical bug type is missed
    System.out.println("huh");
    ;
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES", num = 2)
  @Test
  public void testEqualsFalseNegative() {
    boolean conditionWhile6 = getCondition();
    while (conditionWhile6) {
      // Unreachable code
    }
    Assert.assertEquals(new Double(0), new CustomObject()); // identical bug type is missed

    if (new Double(0).equals(new CustomObject())) // identical bug type is missed
      ;
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES", num = 4)
  public void testEquals5() {
    boolean conditionWhile7 = getCondition();
    while (conditionWhile7) {
      // Unreachable code
    }
    Assert.assertEquals(new Double(0), new BigDecimal("0")); // correctly flagged as a bug
    Assert.assertEquals(new Double(0), new CustomObject()); // correctly flagged as a bug

    if (new Double(0).equals(new BigDecimal("0"))) // correctly flagged as a bug
      ;
    if (new Double(0).equals(new CustomObject())) // correctly flagged as a bug
      ;
  }

  private static class CustomObject {
    // NOP
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}