import javax.annotation.Nonnull;
import org.junit.Test;

class Ideas_2010_01_22 {

  public int needsNonnull(Object x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is false
    }
    return x.hashCode();
  }

  public int needsNonnull2(@Nonnull Object x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is false
    }
    return 17;
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is false
    }
    needsNonnull(null);
  }

  @Test(expected = NullPointerException.class)
  public void testNeedsNonnull2() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is false
    }
    needsNonnull2(null);
  }

  @Test
  public void testNeedsNonnull3() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is false
    }
    needsNonnull(null);
  }

  @Test
  public void testNeedsNonnull4() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is false
    }
    needsNonnull2(null);
  }

  public int badCode() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is false
    }
    return needsNonnull(null);
  }

  public int badCode2() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop will never execute because conditionFor is false
    }
    return needsNonnull2(null);
  }

  private boolean getCondition() {
    return false;
  }
}