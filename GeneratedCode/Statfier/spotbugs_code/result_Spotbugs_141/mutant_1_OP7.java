/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1765">GitHub issue</a>
 */
class Issue1765 {
  @Override
  public int hashCode() {
    // Introduced an unreachable while loop according to the mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is always false
    }
    
    return 476578;
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This ensures the condition is always false at runtime
  }
}