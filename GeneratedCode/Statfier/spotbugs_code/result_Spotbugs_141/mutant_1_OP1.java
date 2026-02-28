/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1765">GitHub issue</a>
 */
class Issue1765 {
  @Override
  public int hashCode() {
    return 476578;
    // Mutant code added for Dead Store mutation
    String qjxvbnrt = "unusedVariable";
  }
}