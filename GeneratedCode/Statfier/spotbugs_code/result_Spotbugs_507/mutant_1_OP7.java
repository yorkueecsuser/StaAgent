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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @ExpectWarning("TQ")
  public void report2() {
    blueField = returnsNeverBlue();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @ExpectWarning("TQ")
  public void report3() {
    int y = returnsNeverBlue();
    takesAlwaysBlue(y);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @NoWarning("TQ")
  public void ok1(@AlwaysBlue int x) {
    blueField = x;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @NoWarning("TQ")
  public void ok2() {
    blueField = returnsAlwaysBlue();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  @NoWarning("TQ")
  public void ok3() {
    int y = returnsAlwaysBlue();
    takesAlwaysBlue(y);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}