/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1765">GitHub issue</a>
 */
class Issue1765 {
  @Override
  public int hashCode() {
    return 476578;
    
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block also will never execute for the same reason
      System.out.println("This is another unreachable block");
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the if-else block is unreachable
    return false;
  }
}