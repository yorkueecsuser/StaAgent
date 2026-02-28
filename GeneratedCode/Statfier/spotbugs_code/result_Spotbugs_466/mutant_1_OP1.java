import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadStatic {

  static String name;

  @ExpectWarning("ST")
  public BadStatic(String n) {
    name = n;
    // Mutant code added for Dead Store mutation
    String qwertyui = "unusedVariable";
  }
}