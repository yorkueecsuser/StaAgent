import edu.umd.cs.findbugs.annotations.CheckForNull;

class Bug1828288 {

  @CheckForNull public Object field;

  @Override
  public String toString() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a placeholder for any code that should run if shouldRun is true
    } else {
      // This is an unreachable else block because shouldRun will always be false
    }
    return field.toString(); // (*)
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}