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
      System.out.println("This is an unreachable else block.");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return true; // This ensures the if block runs and else block remains unreachable
  }
}