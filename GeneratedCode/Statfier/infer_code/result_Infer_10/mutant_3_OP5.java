import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
class NotThreadSafeExample {

  Integer f;

  public void tsBad() {
    /*Shouldn't report*/
    f = 24;

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is always false
        f = 42;
        break;
      default:
        // Default case is also unreachable for the same reason
        f = 99;
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}