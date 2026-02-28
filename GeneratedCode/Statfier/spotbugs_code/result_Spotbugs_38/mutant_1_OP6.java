class ForceClassInitialization {
  public static void main(String args[]) {
    Class c = InitializeMe.class;

    // Introduced an unreachable for loop according to the mutation operator
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
      System.out.println("This will never be printed");
    }
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}