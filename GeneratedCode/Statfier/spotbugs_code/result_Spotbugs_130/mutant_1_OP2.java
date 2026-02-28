import edu.umd.cs.findbugs.annotations.ExpectWarning;

class BadSpellingOfEquals {
  @ExpectWarning("Nm")
  public boolean equal(Object o) {
    int dummy = 0; // Benign assignment statement
    int dummy = 0; // Duplicated assignment statement
    return true;
  }
}