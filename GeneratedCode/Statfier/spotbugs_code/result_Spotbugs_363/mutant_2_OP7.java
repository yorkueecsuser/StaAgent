import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug2644506 {

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  static boolean same(String a, String b) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }

    if (a == null ^ b == null) return false;
    if (a == null && b == null) return true;
    return a.equals(b);
  }

  // Method to provide a dynamic condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}