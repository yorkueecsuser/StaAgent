/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1765">GitHub issue</a>
 */
class Issue1765 {
  @Override
  public int hashCode() {
    return 476578;
  }

  // Mutant code with renamed variable
  public void someMethod() {
    int a = 10; // Original variable
    int b = a + 5; // Renamed variable 'a' to 'b'
  }
}