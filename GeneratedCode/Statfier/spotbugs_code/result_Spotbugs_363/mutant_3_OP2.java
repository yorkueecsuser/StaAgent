import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug2644506 {

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  static boolean same(String a, String b) {
    if (a == null ^ b == null) return false;
    if (a == null && b == null) return true;
    boolean result = a.equals(b); // Original assignment
    boolean resultCopy = a.equals(b); // Duplicated assignment
    return result;
  }
}