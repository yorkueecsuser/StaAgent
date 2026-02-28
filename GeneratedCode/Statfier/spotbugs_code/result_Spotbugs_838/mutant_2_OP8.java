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
  public int needsNonnull(b Object z) {
    return z.hashCode();
  }

  public int needsNonnull2(@Nonnull b z) {
    return 17;
  }

  @Test(expected = NullPointerException.class)
  public void qtestNeedsNonnull() {
    needsNonnull(null);
  }

  @Test(expected = NullPointerException.class)
  public void qtestNeedsNonnull2() {
    needsNonnull2(null);
  }

  @Test
  public void qtestNeedsNonnull3() {
    needsNonnull(null);
  }

  @Test
  public void qtestNeedsNonnull4() {
    needsNonnull2(null);
  }

  public int qbadCode() {
    return needsNonnull(null);
  }

  public int qbadCode2() {
    return needsNonnull2(null);
  }
}