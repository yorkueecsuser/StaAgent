/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1765">GitHub issue</a>
 */
class Issue1765 {
  @Override
  public int hashCode() {
    return 476578;
    
    // Introduced unreachable if statement as per mutation operator requirements
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    }
  }

  private boolean getUnreachableCondition() {
    // This method returns false, making the if block unreachable
    return false;
  }
}