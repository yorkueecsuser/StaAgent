import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3307637 {

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp1() {
    for (float x = 1.0f; x < 1000.0f; x++) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
      } else {
        // Alternative code that should also never run
      }
    }
  }

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp2() {
    for (float x = 1.0f; x < 1000.0f; x += 1.0f) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should never run
      } else {
        // Alternative code that should also never run
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}