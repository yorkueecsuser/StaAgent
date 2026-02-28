class ForceClassInitialization {
  public static void main(String args[]) {
    Class c = InitializeMe.class;

    // Mutant code: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code block
      System.out.println("This is an unreachable loop iteration.");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}