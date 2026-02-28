import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3307637 {

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp1() {
    for (float x = 1.0f; x < 1000.0f; x++) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable if block in fp1");
      } else {
        // This block should also never execute
        System.out.println("This is an unreachable else block in fp1");
      }
    }
  }

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp2() {
    for (float x = 1.0f; x < 1000.0f; x += 1.0f) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never execute
        System.out.println("This is an unreachable if block in fp2");
      } else {
        // This block should also never execute
        System.out.println("This is an unreachable else block in fp2");
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}