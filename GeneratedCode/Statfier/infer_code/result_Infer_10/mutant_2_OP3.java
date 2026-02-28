import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
class NotThreadSafeExample {

  Integer f;

  public void tsBad() {
    /*Shouldn't report*/
    f = 24;

    // Mutant code starts here
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      f = 42;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}