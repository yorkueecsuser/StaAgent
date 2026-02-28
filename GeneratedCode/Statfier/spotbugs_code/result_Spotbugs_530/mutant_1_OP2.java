import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_14 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String foo(Object o) {
    if (Integer.class.isInstance(o)) {
      String temp = (String) o; // Original assignment
      String tempCopy = (String) o; // Duplicated assignment
      return temp;
    }
    return "";
  }
}