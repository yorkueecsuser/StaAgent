import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug2644506 {

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  static boolean same(String a, String b) {
    if (a == null ^ b == null) return false;
    if (a == null && b == null) return true;
    
    // Inserting an unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable because getUnreachableCondition() always returns false
      return false;
    } else {
      // This block is also unreachable because the if block is unreachable
      return true;
    }

    return a.equals(b);
  }

  // Method to provide a dynamic but always false condition
  private static boolean getUnreachableCondition() {
    return false;
  }
}