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

  // Mutated code starts here
  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals1b() {
    Double x = new Double(0);
    BigDecimal y = new BigDecimal("0");
    Assert.assertEquals(x, y); // correctly flagged as a bug
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals2b() {
    Double a = new Double(0);
    CustomObject b = new CustomObject();
    Assert.assertEquals(a, b); // identical bug type is missed
  }

  @NoWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals2ab() {
    Double c = new Double(0);
    CustomObject d = new CustomObject();
    Assert.assertFalse(c.equals(d));
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals3b() {
    Double e = new Double(0);
    BigDecimal f = new BigDecimal("0");
    if (e.equals(f)) // correctly flagged as a bug
    System.out.println("huh");
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES")
  @Test
  public void testEquals4b() {
    Double g = new Double(0);
    CustomObject h = new CustomObject();
    if (g.equals(h)) // identical bug type is missed
    System.out.println("huh");
    ;
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES", num = 2)
  @Test
  public void testEqualsFalseNegativeb() {
    Double i = new Double(0);
    CustomObject j = new CustomObject();
    Assert.assertEquals(i, j); // identical bug type is missed

    if (i.equals(j)) // identical bug type is missed
      ;
  }

  @ExpectWarning(value = "EC_UNRELATED_TYPES", num = 4)
  public void testEquals5b() {
    Double k = new Double(0);
    BigDecimal l = new BigDecimal("0");
    Assert.assertEquals(k, l); // correctly flagged as a bug

    Double m = new Double(0);
    CustomObject n = new CustomObject();
    Assert.assertEquals(m, n); // correctly flagged as a bug

    if (k.equals(l)) // correctly flagged as a bug
      ;

    if (m.equals(n)) // correctly flagged as a bug
      ;
  }

  private static class CustomObjectb {
    // NOP
  }
}