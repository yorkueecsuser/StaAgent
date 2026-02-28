/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1765">GitHub issue</a>
 */
class Issue1765 {
  @Override
  public int hashCode() {
    return 476578;
  }

  // Introduced an unreachable switch statement
  private boolean getUnreachableCondition() {
    return false;
  }

  public void someMethod() {
    boolean condition = getUnreachableCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because getUnreachableCondition() always returns false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case to ensure the switch is not empty and reachable
        System.out.println("This is the default case");
        break;
    }
  }
}