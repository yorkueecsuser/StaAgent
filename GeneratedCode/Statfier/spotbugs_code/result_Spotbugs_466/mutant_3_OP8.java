import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadStatic {

  static String name;

  @ExpectWarning("ST")
  public BadStatic(String n) {
    name = n;
  }

  // Mutated code
  static String x;

  @ExpectWarning("ST")
  public BadStatic(String m) {
    x = m;
  }
}