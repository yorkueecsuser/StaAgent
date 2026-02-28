import javax.annotation.Nonnull;
import org.junit.Test;

class Ideas_2010_01_22 {

  public int needsNonnull(Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return x.hashCode();
  }

  public int needsNonnull2(@Nonnull Object x) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return 17;
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    needsNonnull(null);
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull2() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    needsNonnull2(null);
  }

  @Test
  public void testNeedsNonnull3() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    needsNonnull(null);
  }

  @Test
  public void testNeedsNonnull4() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    needsNonnull2(null);
  }

  public int badCode() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return needsNonnull(null);
  }

  public int badCode2() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }
    return needsNonnull2(null);
  }

  private boolean getCondition() {
    return false;
  }
}