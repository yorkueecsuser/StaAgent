import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
class NotThreadSafeExample {

  Integer f;

  public void tsBad() {
    /*Shouldn't report*/
    f = 24;

    // Introduced unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code block
      System.out.println("This loop is unreachable");
    }
  }

  private boolean getCondition() {
    return false;
  }
}