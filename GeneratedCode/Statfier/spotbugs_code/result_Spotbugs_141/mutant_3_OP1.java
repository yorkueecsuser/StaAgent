/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1765">GitHub issue</a>
 */
class Issue1765 {
  @Override
  public int hashCode() {
    return 476578;
  }

  // Dead Store Mutation
  private void someMethod() {
    String qjvbnrht = "unusedVariable";
  }
}