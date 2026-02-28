import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.math.BigDecimal;
import junit.framework.Assert;
import org.junit.Test;

class Bug3474679 {
  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals1() {
    Assert.assertEquals(new Double(0), new BigDecimal("0")); // correctly flagged as a bug
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals2() {
    Assert.assertEquals(new Double(0), new CustomObject()); // identical bug type is missed
  }

  @NoWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals2a() {
    Assert.assertFalse(new Double(0).equals(new CustomObject()));
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals3() {
    if (new Double(0).equals(new BigDecimal("0"))) // correctly flagged as a bug
    System.out.println("huh");
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals4() {
    if (new Double(0).equals(new CustomObject())) // identical bug type is missed
    System.out.println("huh");
    ;
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES", num = 2)
  @Test
  public void testEqualsFalseNegative() {
    Assert.assertEquals(new Double(0), new CustomObject()); // identical bug type is missed

    if (new Double(0).equals(new CustomObject())) // identical bug type is missed
      ;
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES", num = 4)
  public void testEquals5() {
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

  // Mutated code
  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals1b() {
    Double a = new Double(0);
    BigDecimal b = new BigDecimal("0");
    Assert.assertEquals(a, b); // correctly flagged as a bug
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals2b() {
    Double c = new Double(0);
    CustomObject d = new CustomObject();
    Assert.assertEquals(c, d); // identical bug type is missed
  }

  @NoWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals2ab() {
    Double e = new Double(0);
    CustomObject f = new CustomObject();
    Assert.assertFalse(e.equals(f));
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals3b() {
    Double g = new Double(0);
    BigDecimal h = new BigDecimal("0");
    if (g.equals(h)) // correctly flagged as a bug
    System.out.println("huh");
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals4b() {
    Double i = new Double(0);
    CustomObject j = new CustomObject();
    if (i.equals(j)) // identical bug type is missed
    System.out.println("huh");
    ;
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES", num = 2)
  @Test
  public void testEqualsFalseNegativeb() {
    Double k = new Double(0);
    CustomObject l = new CustomObject();
    Assert.assertEquals(k, l); // identical bug type is missed

    if (k.equals(l)) // identical bug type is missed
      ;
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES", num = 4)
  public void testEquals5b() {
    Double m = new Double(0);
    BigDecimal n = new BigDecimal("0");
    Assert.assertEquals(m, n); // correctly flagged as a bug
    Assert.assertEquals(m, new CustomObject()); // correctly flagged as a bug

    if (m.equals(n)) // correctly flagged as a bug
      ;
    if (m.equals(new CustomObject())) // correctly flagged as a bug
      ;
  }
}