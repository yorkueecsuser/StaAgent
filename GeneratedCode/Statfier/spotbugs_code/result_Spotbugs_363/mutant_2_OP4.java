import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug2644506 {

  @DesireNoWarning("NP_NULL_ON_SOME_PATH")
  static boolean same(String a, String b) {
    if (a == null ^ b == null) return false;
    if (a == null && b == null) return true;
    
    // Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      System.out.println("This should never be printed");
    } else {
      // Alternative code that is also unreachable due to the nature of the condition
      System.out.println("This should also never be printed");
    }
    
    return a.equals(b);
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}