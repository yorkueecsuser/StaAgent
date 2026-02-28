import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3307637 {

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp1() {
    for (float x = 1.0f; x < 1000.0f; x++)
      ;

    // Mutant: Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp2() {
    for (float x = 1.0f; x < 1000.0f; x += 1.0f)
      ;

    // Mutant: Inserting an unreachable while loop
    boolean conditionWhile = getAnotherCondition();
    while (conditionWhile) {
      // This loop is unreachable because getAnotherCondition() will return false
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