import javax.annotation.Nonnull;
import org.junit.Test;

class Ideas_2010_01_22 {

  public int needsNonnull(Object x) {
    int hash = x.hashCode();
    int hashCopy = hash; // Mutation: Duplicate assignment statement
    return hash;
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
    int result = needsNonnull(null);
    int resultCopy = result; // Mutation: Duplicate assignment statement
    return result;
  }

  public int badCode2() {
    return needsNonnull2(null);
  }
}