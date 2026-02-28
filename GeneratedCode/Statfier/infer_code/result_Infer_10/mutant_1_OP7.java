import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
class NotThreadSafeExample {

  Integer f;

  public void tsBad() {
    /*Shouldn't report*/
    f = 24;

    // Introduced unreachable while loop according to mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code block
      f = 42;
    }
  }

  private boolean getCondition() {
    return false;
  }
}