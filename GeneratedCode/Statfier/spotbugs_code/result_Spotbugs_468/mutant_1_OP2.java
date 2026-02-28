import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1678228 {
  @NonNull String str;

  int val;

  public Bug1678228(String str) {
    if (str == null) {
      val = 0;
      val = 0; // Mutant: duplicated assignment
    } else {
      val = Integer.parseInt(str);
      val = Integer.parseInt(str); // Mutant: duplicated assignment, but this will throw an exception if str is not a valid integer
    }
    this.str = str;
    this.str = str; // Mutant: duplicated assignment
  }
}