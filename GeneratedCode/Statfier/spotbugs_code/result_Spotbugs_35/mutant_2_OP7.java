import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3307637 {

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp1() {
    for (float x = 1.0f; x < 1000.0f; x++)
      ;

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
    }
  }

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp2() {
    for (float x = 1.0f; x < 1000.0f; x += 1.0f)
      ;

    // Inserting another unique unreachable while loop
    boolean anotherConditionWhile = getAnotherCondition();
    while (anotherConditionWhile) {
      // This loop is also unreachable because anotherConditionWhile is always false
    }
  }

  private static boolean getCondition() {
    return false;
  }

  private static boolean getAnotherCondition() {
    return false;
  }
}