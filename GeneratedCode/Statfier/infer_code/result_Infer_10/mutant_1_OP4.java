import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
class NotThreadSafeExample {

  Integer f;

  public void tsBad() {
    /*Shouldn't report*/
    f = 24;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      f = 42;
    } else {
      // This block will also never execute because getCondition() always returns false
      f = 99;
    }
  }

  private boolean getCondition() {
    // Always return false to make the if-else branch unreachable
    return false;
  }
}