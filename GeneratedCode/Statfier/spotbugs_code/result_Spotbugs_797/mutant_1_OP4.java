import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NewForGetClass {
  @ExpectWarning("ISC_INSTANTIATE_STATIC_CLASS")
  public static void main(String[] args) {
    // Just do : Class c = NewForGetClass.class;
    Class c = new NewForGetClass().getClass();

    // Mutant code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will run if shouldRun is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This is an unreachable block.");
    }
  }

  // Method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}