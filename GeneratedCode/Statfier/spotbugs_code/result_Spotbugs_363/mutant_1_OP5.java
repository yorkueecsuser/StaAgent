import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug2644506 {

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  static boolean same(String a, String b) {
    // Introducing an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }

    if (a == null ^ b == null) return false;
    if (a == null && b == null) return true;
    return a.equals(b);
  }

  // Method to provide a dynamic condition that always evaluates to false
  private static boolean getCondition() {
    return false;
  }
}