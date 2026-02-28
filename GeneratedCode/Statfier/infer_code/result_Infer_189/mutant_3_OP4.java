import javax.annotation.Nullable;

class SomeExternalClass {
  public Object field;

  public Object externalMethod1() {
    return null;
  }

  public void externalMethod2(@Nullable Object object) {
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
    } else {
      // This block is unreachable because shouldRun is never set to false in this context
    }
  }

  private boolean getCondition() {
    // This method always returns true, ensuring the else block is unreachable
    return true;
  }
}