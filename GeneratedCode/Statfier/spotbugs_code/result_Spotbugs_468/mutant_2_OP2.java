import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1678228 {
  @NonNull String str;

  int val;

  public Bug1678228(String str) {
    if (str == null) {
      val = 0;
      val = 0; // Mutant: duplicated assignment statement
    } else {
      val = Integer.parseInt(str);
      val = Integer.parseInt(str); // This line is not duplicated due to method invocation
    }
    this.str = str;
    this.str = str; // Mutant: duplicated assignment statement
  }
}