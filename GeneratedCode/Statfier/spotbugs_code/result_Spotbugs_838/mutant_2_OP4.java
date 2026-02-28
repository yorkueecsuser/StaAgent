import javax.annotation.Nonnull;
import org.junit.Test;

class Ideas_2010_01_22 {

  public int needsNonnull(Object x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun &&!shouldRun) {
        return -1;
      } else {
        return -2;
      }
    }
    return x.hashCode();
  }

  public int needsNonnull2(@Nonnull Object x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun &&!shouldRun) {
        return -3;
      } else {
        return -4;
      }
    }
    return 17;
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun &&!shouldRun) {
        System.out.println("Unreachable");
      } else {
        System.out.println("Also unreachable");
      }
    }
    needsNonnull(null);
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun &&!shouldRun) {
        System.out.println("Unreachable");
      } else {
        System.out.println("Also unreachable");
      }
    }
    needsNonnull2(null);
  }

  @Test
  public void testNeedsNonnull3() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun &&!shouldRun) {
        System.out.println("Unreachable");
      } else {
        System.out.println("Also unreachable");
      }
    }
    needsNonnull(null);
  }

  @Test
  public void testNeedsNonnull4() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun &&!shouldRun) {
        System.out.println("Unreachable");
      } else {
        System.out.println("Also unreachable");
      }
    }
    needsNonnull2(null);
  }

  public int badCode() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun &&!shouldRun) {
        return -5;
      } else {
        return -6;
      }
    }
    return needsNonnull(null);
  }

  public int badCode2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (shouldRun &&!shouldRun) {
        return -7;
      } else {
        return -8;
      }
    }
    return needsNonnull2(null);
  }

  private boolean getCondition() {
    return true; // This ensures the condition is dynamically determined at runtime
  }
}