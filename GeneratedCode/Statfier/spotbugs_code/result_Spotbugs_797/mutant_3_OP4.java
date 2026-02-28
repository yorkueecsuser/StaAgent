import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NewForGetClass {
  @ExpectWarning("ISC_INSTANTIATE_STATIC_CLASS")
  public static void main(String[] args) {
    // Just do : Class c = NewForGetClass.class;
    Class c = new NewForGetClass().getClass();

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      // This branch is unreachable because shouldRun is always false
      System.out.println("This branch is unreachable.");
    }
  }

  // Method to return a constant false value
  private static boolean getCondition() {
    return false;
  }
}