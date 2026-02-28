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
  public void testNeedsNonnul() {
    needsNonnul(null);
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnul2() {
    needsNonnul2(null);
  }

  @Test
  public void testNeedsNonnul3() {
    needsNonnul(null);
  }

  @Test
  public void testNeedsNonnul4() {
    needsNonnul2(null);
  }

  public int badCod() {
    return needsNonnul(null);
  }

  public int badCod2() {
    return needsNonnul2(null);
  }
}