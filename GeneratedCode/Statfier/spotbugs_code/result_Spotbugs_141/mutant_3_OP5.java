/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1765">GitHub issue</a>
 */
class Issue1765 {
  @Override
  public int hashCode() {
    return 476578;
  }

  // Introduced an unreachable switch statement
  private boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because getCondition() always returns false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case to ensure the switch is not empty and reachable
        System.out.println("Default case");
        break;
    }
  }
}