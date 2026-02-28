/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1765">GitHub issue</a>
 */
class Issue1765 {
  @Override
  public int hashCode() {
    return 476578;
  }

  private boolean getCondition() {
    return false;
  }

  private int getValue() {
    return 0;
  }

  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never run
    }

    int value = getValue();
    switch (value) {
      case 1:
        // Some code that will never run
        break;
      case 2:
        // Some code that will never run
        break;
      default:
        // Some code that will never run
        break;
    }
  }
}