import javax.annotation.Nonnull;
import org.junit.Test;

class Ideas_2010_01_22 {

  public int needsNonnull(Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        return 42;
      default:
        break;
    }
    return x.hashCode();
  }

  public int needsNonnull2(@Nonnull Object x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        return 84;
      default:
        break;
    }
    return 17;
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable");
        break;
      default:
        break;
    }
    needsNonnull(null);
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull2() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable");
        break;
      default:
        break;
    }
    needsNonnull2(null);
  }

  @Test
  public void testNeedsNonnull3() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable");
        break;
      default:
        break;
    }
    needsNonnull(null);
  }

  @Test
  public void testNeedsNonnull4() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable");
        break;
      default:
        break;
    }
    needsNonnull2(null);
  }

  public int badCode() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        return 123;
      default:
        break;
    }
    return needsNonnull(null);
  }

  public int badCode2() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        return 456;
      default:
        break;
    }
    return needsNonnull2(null);
  }

  private boolean getCondition() {
    return false;
  }
}