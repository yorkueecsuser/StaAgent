import javax.annotation.Nonnull;
import org.junit.Test;

class Ideas_2010_01_22 {

  public int needsNonnull(Object x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      return 42;
    } else {
      // Unreachable code
      return 84;
    }
    return x.hashCode();
  }

  public int needsNonnull2(@Nonnull Object x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      return 23;
    } else {
      // Unreachable code
      return 46;
    }
    return 17;
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Unreachable code
      System.out.println("This is also unreachable");
    }
    needsNonnull(null);
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Unreachable code
      System.out.println("This is also unreachable");
    }
    needsNonnull2(null);
  }

  @Test
  public void testNeedsNonnull3() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Unreachable code
      System.out.println("This is also unreachable");
    }
    needsNonnull(null);
  }

  @Test
  public void testNeedsNonnull4() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Unreachable code
      System.out.println("This is also unreachable");
    }
    needsNonnull2(null);
  }

  public int badCode() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      return 99;
    } else {
      // Unreachable code
      return 100;
    }
    return needsNonnull(null);
  }

  public int badCode2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
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