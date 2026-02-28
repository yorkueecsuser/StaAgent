import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug2644506 {

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  static boolean same(String a, String b) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is intended to be unreachable
    }

    if (a == null ^ b == null) return false;
    if (a == null && b == null) return true;
    return a.equals(b);
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}