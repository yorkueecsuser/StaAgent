import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3307637 {

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp1() {
    for (float x = 1.0f; x < 1000.0f; x++)
      ;

    // Mutant: Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false at runtime
    }
  }

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp2() {
    for (float x = 1.0f; x < 1000.0f; x += 1.0f)
      ;

    // Mutant: Inserting another unique unreachable for loop
    boolean conditionFor2 = getAnotherCondition();
    for (int j = 0; conditionFor2; j++) {
      // This loop is also unreachable because conditionFor2 will be false at runtime
    }
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }

  // Another method to provide a different dynamic condition that will always be false
  private static boolean getAnotherCondition() {
    return false;
  }
}