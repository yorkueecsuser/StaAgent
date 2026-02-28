import edu.umd.cs.findbugs.annotations.NonNull;

class Bug1678228 {
  @NonNull String str;

  int val;

  public Bug1678228(String str) {
    if (str == null) {
      val = 0;
      // Dead store mutation
      String jhgfdsaq = "unused";
    } else {
      val = Integer.parseInt(str);
      // Dead store mutation
      int wertypoi = 42;
    }
    this.str = str;
  }
}