import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

/** Type qualifiers may be applied to primitive values, not just reference values. */
public abstract class TestTypeQualifiersOnPrimitiveValues {
  @AlwaysBlue int blueField;

  @NeverBlue
  protected abstract int returnsNeverBlue();

  protected abstract void takesAlwaysBlue(@AlwaysBlue int x);

  @AlwaysBlue
  protected abstract int returnsAlwaysBlue();

  @ExpectWarning("TQ")
  public void report1(@NeverBlue int x) {
    blueField = x;
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      blueField = 0; // This line is unreachable
    }
  }

  @ExpectWarning("TQ")
  public void report2() {
    blueField = returnsNeverBlue();
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      blueField = 1; // This line is unreachable
    }
  }

  @ExpectWarning("TQ")
  public void report3() {
    int y = returnsNeverBlue();
    takesAlwaysBlue(y);
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      y = 2; // This line is unreachable
    }
  }

  @NoWarning("TQ")
  public void ok1(@AlwaysBlue int x) {
    blueField = x;
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      blueField = 3; // This line is unreachable
    }
  }

  @NoWarning("TQ")
  public void ok2() {
    blueField = returnsAlwaysBlue();
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      blueField = 4; // This line is unreachable
    }
  }

  @NoWarning("TQ")
  public void ok3() {
    int y = returnsAlwaysBlue();
    takesAlwaysBlue(y);
    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      y = 5; // This line is unreachable
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}