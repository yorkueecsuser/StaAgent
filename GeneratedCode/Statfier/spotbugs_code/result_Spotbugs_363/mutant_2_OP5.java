import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug2644506 {

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  static boolean same(String a, String b) {
    if (a == null ^ b == null) return false;
    if (a == null && b == null) return true;

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() will never return true
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to ensure switch is not empty
        break;
    }

    return a.equals(b);
  }

  // Method to provide a dynamic condition that will never be true
  private static boolean getCondition() {
    return false;
  }
}