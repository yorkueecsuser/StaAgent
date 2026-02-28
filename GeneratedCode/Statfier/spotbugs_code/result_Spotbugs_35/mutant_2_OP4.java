import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3307637 {

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp1() {
    for (float x = 1.0f; x < 1000.0f; x++) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in fp1");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in fp1");
      }
    }
  }

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp2() {
    for (float x = 1.0f; x < 1000.0f; x += 1.0f) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in fp2");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in fp2");
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}