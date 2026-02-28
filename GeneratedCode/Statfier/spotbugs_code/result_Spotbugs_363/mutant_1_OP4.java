import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug2644506 {

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  static boolean same(String a, String b) {
    if (a == null ^ b == null) return false;
    if (a == null && b == null) return true;
    
    // Introduced unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable
      System.out.println("This is another unreachable block");
    }
    
    return a.equals(b);
  }

  // Method to provide a dynamically determined condition that is always false
  private static boolean getUnreachableCondition() {
    return false;
  }
}