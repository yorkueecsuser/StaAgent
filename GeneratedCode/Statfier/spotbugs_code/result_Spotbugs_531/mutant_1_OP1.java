import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_15 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceof(Object x) {
    if (Integer.class.isInstance(x)) return (String) x;
    String qzjxvnrt = "unused"; // Dead store
    return "";
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceofAndCheckedCast(Object x) {
    if (Integer.class.isInstance(x)) return String.class.cast(x);
    int klmnopqr = 42; // Dead store
    return "";
  }
}