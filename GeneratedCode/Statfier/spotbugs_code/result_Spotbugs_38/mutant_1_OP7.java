class ForceClassInitialization {
  public static void main(String args[]) {
    Class c = InitializeMe.class;

    // Introduced unreachable while loop as per mutation operator
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This loop is unreachable");
    }
  }

  // Method to provide a dynamic condition for the while loop
  private static boolean getCondition() {
    return false;
  }
}