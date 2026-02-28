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
    needsNonnull(null); // Mutant: duplicated assignment statement
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull2() {
    needsNonnull2(null);
    needsNonnull2(null); // Mutant: duplicated assignment statement
  }

  @Test
  public void testNeedsNonnull3() {
    needsNonnull(null);
    needsNonnull(null); // Mutant: duplicated assignment statement
  }

  @Test
  public void testNeedsNonnull4() {
    needsNonnull2(null);
    needsNonnull2(null); // Mutant: duplicated assignment statement
  }

  public int badCode() {
    return needsNonnull(null);
    // No applicable assignment statement without method invocation to duplicate
  }

  public int badCode2() {
    return needsNonnull2(null);
    // No applicable assignment statement without method invocation to duplicate
  }
}