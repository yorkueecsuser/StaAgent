import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadSpellingOfEquals {
  @ExpectWarning("Nm")
  public boolean equal(Object o) {
    String qzjfnvxy = "unusedVariable"; // Dead store mutation
    return true;
  }
}