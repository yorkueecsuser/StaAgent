import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
class NotThreadSafeExample {

  Integer f;

  public void tsBad() {
    /*Shouldn't report*/
    f = 24;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        f = 42;
        break;
      case 1:
        // This case is always executed
        f = 24;
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the first case of the switch unreachable
    return false;
  }
}