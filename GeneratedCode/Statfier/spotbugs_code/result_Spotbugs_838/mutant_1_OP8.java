import javax.annotation.Nonnull;
import org.junit.Test;

class Ideas_2010_01_22 {

  public int needsNonnull(Object x) {
    return x.hashCode();
  }

  public int needsNonnull2(@Nonnull Object x) {
    return 17;
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull() {
    needsNonnull(null);
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull2() {
    needsNonnull2(null);
  }

  @Test
  public void testNeedsNonnull3() {
    needsNonnull(null);
  }

  @Test
  public void testNeedsNonnull4() {
    needsNonnull2(null);
  }

  public int badCode() {
    return needsNonnull(null);
  }

  public int badCode2() {
    return needsNonnull2(null);
  }

  // Mutated code
  public int needsNonnull(Object y) {
    return y.hashCode();
  }

  public int needsNonnull2(@Nonnull Object z) {
    return 17;
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnulld() {
    needsNonnulld(null);
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull2e() {
    needsNonnull2e(null);
  }

  @Test
  public void testNeedsNonnull3f() {
    needsNonnulld(null);
  }

  @Test
  public void testNeedsNonnull4g() {
    needsNonnull2e(null);
  }

  public int badCodeh() {
    return needsNonnulld(null);
  }

  public int badCode2i() {
    return needsNonnull2e(null);
  }
}