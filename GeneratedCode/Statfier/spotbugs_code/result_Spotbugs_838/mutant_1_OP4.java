import javax.annotation.Nonnull;
import org.junit.Test;

class Ideas_2010_01_22 {

  public int needsNonnull(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 42;
    } else {
      // Unreachable code
      return 84;
    }
    return x.hashCode();
  }

  public int needsNonnull2(@Nonnull Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 18;
    } else {
      // Unreachable code
      return 36;
    }
    return 17;
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable");
    } else {
      // Unreachable code
      System.out.println("Still Unreachable");
    }
    needsNonnull(null);
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull2() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable");
    } else {
      // Unreachable code
      System.out.println("Still Unreachable");
    }
    needsNonnull2(null);
  }

  @Test
  public void testNeedsNonnull3() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable");
    } else {
      // Unreachable code
      System.out.println("Still Unreachable");
    }
    needsNonnull(null);
  }

  @Test
  public void testNeedsNonnull4() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable");
    } else {
      // Unreachable code
      System.out.println("Still Unreachable");
    }
    needsNonnull2(null);
  }

  public int badCode() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 99;
    } else {
      // Unreachable code
      return 100;
    }
    return needsNonnull(null);
  }

  public int badCode2() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 99;
    } else {
      // Unreachable code
      return 100;
    }
    return needsNonnull2(null);
  }

  private boolean getCondition() {
    return false;
  }
}