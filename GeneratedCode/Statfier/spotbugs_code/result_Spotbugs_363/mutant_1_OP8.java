import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug2644506 {

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  static boolean same(String a, String b) {
    if (a == null ^ b == null) return false;
    if (a == null && b == null) return true;
    return a.equals(b);
  }

  // Mutated code with renaming of variable 'a' to 'x'
  static boolean sameMutated(String x, String b) {
    if (x == null ^ b == null) return false;
    if (x == null && b == null) return true;
    return x.equals(b);
  }
}