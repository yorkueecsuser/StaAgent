import javax.annotation.Nonnull;
import org.junit.Test;

class Ideas_2010_01_22 {

  public int needsNonnull(Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        return x.hashCode();
      default:
        return x.hashCode();
    }
  }

  public int needsNonnull2(@Nonnull Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        return 17;
      default:
        return 17;
    }
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
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        return needsNonnull(null);
      default:
        return needsNonnull(null);
    }
  }

  public int badCode2() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        return needsNonnull2(null);
      default:
        return needsNonnull2(null);
    }
  }

  private boolean getCondition() {
    return false;
  }
}