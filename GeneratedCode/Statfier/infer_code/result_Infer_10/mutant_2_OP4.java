import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
class NotThreadSafeExample {

  Integer f;

  public void tsBad() {
    /*Shouldn't report*/
    f = 24;

    // Mutant code start
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      f = 42;
    } else {
      // This block will always execute
      f = 99;
    }
    // Mutant code end
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}