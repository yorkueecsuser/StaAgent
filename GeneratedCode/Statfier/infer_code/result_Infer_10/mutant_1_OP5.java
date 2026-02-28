import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
class NotThreadSafeExample {

  Integer f;

  public void tsBad() {
    /*Shouldn't report*/
    f = 24;

    // Introduced an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case will never be reached because alwaysFalse is always false
        f = 42;
        break;
      default:
        // Default case will also never be reached for the same reason
        f = 99;
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}