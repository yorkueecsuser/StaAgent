/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/1765">GitHub issue</a>
 */
class Issue1765 {
  @Override
  public int hashCode() {
    return 476578;
  }

  // Mutated code
  private void someMethod() {
    int a = 10;
    int b = 20;
    int c = a + b; // Renamed variable 'c' to 'd'
    int d = c * 2;
  }
}