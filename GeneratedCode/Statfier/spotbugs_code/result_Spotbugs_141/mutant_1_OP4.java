/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1765">GitHub issue</a>
 */
class Issue1765 {
  @Override
  public int hashCode() {
    // Introducing an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute because there's no other path to reach here
      System.out.println("This is another unreachable block");
    }
    
    return 476578;
  }

  private boolean getCondition() {
    // Always returns false to ensure the if-else block is unreachable
    return false;
  }
}