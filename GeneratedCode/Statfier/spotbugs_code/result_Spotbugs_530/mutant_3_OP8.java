import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_14 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String foo(Object o) {
    if (Integer.class.isInstance(o)) return (String) o;
    return "";
  }

  // Mutated code with renaming of variable 'o' to 'x'
  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String bar(Object x) {
    if (Integer.class.isInstance(x)) return (String) x;
    return "";
  }
}