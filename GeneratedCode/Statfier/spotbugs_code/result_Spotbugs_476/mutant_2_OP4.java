class Bug2436026 {

  private String[] args;

  private static String[] staticArgs;

  public Bug2436026(String... myArgs) {
    args = myArgs;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block in the constructor.");
    } else {
      // This block will also never execute because the if condition is always false
      System.out.println("This is another unreachable block in the constructor.");
    }
  }

  public static void setStatic(String... myArgs) {
    staticArgs = myArgs;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getStaticCondition();
    if (condition) {
      // This block will never execute because getStaticCondition() always returns false
      System.out.println("This is an unreachable block in the static method.");
    } else {
      // This block will also never execute because the if condition is always false
      System.out.println("This is another unreachable block in the static method.");
    }
  }

  // Method to simulate a condition that always returns false
  private boolean getCondition() {
    return false;
  }

  // Static method to simulate a condition that always returns false
  private static boolean getStaticCondition() {
    return false;
  }
}