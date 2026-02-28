import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
class NotThreadSafeExample {

  Integer f;

  public void tsBad() {
    /*Shouldn't report*/
    f = 24;

    // Introduced unreachable if statement based on the mutation operator
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      f = 42;
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}