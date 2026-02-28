import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug2644506 {

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  static boolean same(String a, String b) {
    if (a == null ^ b == null) return false;
    if (a == null && b == null) return true;

    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be reached because getCondition() does not return true
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case will also never be reached for the same reason
        System.out.println("This is also an unreachable case.");
        break;
    }

    return a.equals(b);
  }

  // Method to provide a dynamic condition that ensures the switch is unreachable
  private static boolean getCondition() {
    return false;
  }
}