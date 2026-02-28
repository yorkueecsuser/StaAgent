import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.math.BigDecimal;
import junit.framework.Assert;
import org.junit.Test;

class Bug3474679 {
  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals1() {
    String xwqjvbnr; // Dead store
    Assert.assertEquals(new Double(0), new BigDecimal("0")); // correctly flagged as a bug
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals2() {
    int ytrkzpoi; // Dead store
    Assert.assertEquals(new Double(0), new CustomObject()); // identical bug type is missed
  }

  @NoWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals2a() {
    double fghjklmn; // Dead store
    Assert.assertFalse(new Double(0).equals(new CustomObject()));
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals3() {
    boolean opqrstuv; // Dead store
    if (new Double(0).equals(new BigDecimal("0"))) // correctly flagged as a bug
    System.out.println("huh");
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals4() {
    char wxyzabcd; // Dead store
    if (new Double(0).equals(new CustomObject())) // identical bug type is missed
    System.out.println("huh");
    ;
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES", num = 2)
  @Test
  public void testEqualsFalseNegative() {
    long efghijkl; // Dead store
    Assert.assertEquals(new Double(0), new CustomObject()); // identical bug type is missed

    if (new Double(0).equals(new CustomObject())) // identical bug type is missed
      ;
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES", num = 4)
  public void testEquals5() {
    floatmnopqr; // Dead store
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
}