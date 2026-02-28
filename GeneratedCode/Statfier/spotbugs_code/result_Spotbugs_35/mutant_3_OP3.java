import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3307637 {

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp1() {
    for (float x = 1.0f; x < 1000.0f; x++) {
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
      }
      ;
    }
  }

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp2() {
    for (float x = 1.0f; x < 1000.0f; x += 1.0f) {
      boolean anotherCondition = getAnotherCondition();
      if (anotherCondition) {
        // This block is unreachable because getAnotherCondition() always returns false
      }
      ;
    }
  }

  private static boolean getCondition() {
    return false;
  }

  private static boolean getAnotherCondition() {
    return false;
  }
}