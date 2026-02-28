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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      blueField = 0;
    } else {
      // Alternative code that should also never run
      blueField = 1;
    }
  }

  @ExpectWarning("TQ")
  public void report2() {
    blueField = returnsNeverBlue();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      blueField = 0;
    } else {
      // Alternative code that should also never run
      blueField = 1;
    }
  }

  @ExpectWarning("TQ")
  public void report3() {
    int y = returnsNeverBlue();
    takesAlwaysBlue(y);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      y = 0;
    } else {
      // Alternative code that should also never run
      y = 1;
    }
  }

  @NoWarning("TQ")
  public void ok1(@AlwaysBlue int x) {
    blueField = x;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      blueField = 0;
    } else {
      // Alternative code that should also never run
      blueField = 1;
    }
  }

  @NoWarning("TQ")
  public void ok2() {
    blueField = returnsAlwaysBlue();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      blueField = 0;
    } else {
      // Alternative code that should also never run
      blueField = 1;
    }
  }

  @NoWarning("TQ")
  public void ok3() {
    int y = returnsAlwaysBlue();
    takesAlwaysBlue(y);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      y = 0;
    } else {
      // Alternative code that should also never run
      y = 1;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}