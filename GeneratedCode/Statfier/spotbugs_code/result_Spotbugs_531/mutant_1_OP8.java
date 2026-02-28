import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_15 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceof(Object x) {
    if (Integer.class.isInstance(x)) return (String) x;
    return "";
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceofAndCheckedCast(Object x) {
    if (Integer.class.isInstance(x)) return String.class.cast(x);
    return "";
  }

  // Mutated code
  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceof(b Object y) {
    if (Integer.class.isInstance(y)) return (String) y;
    return "";
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceofAndCheckedCast(b Object z) {
    if (Integer.class.isInstance(z)) return String.class.cast(z);
    return "";
  }
}