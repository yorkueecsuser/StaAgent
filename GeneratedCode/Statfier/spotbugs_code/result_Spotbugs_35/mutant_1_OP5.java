import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3307637 {

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp1() {
    for (float x = 1.0f; x < 1000.0f; x++) {
      boolean unreachableCondition = getUnreachableCondition();
      switch (unreachableCondition? 0 : 1) {
        case 0:
          // This case is unreachable because getUnreachableCondition() always returns false
          System.out.println("This will never be printed");
          break;
        default:
          // Default case to ensure the switch is not empty
          break;
      }
    }
  }

  @NoWarning("IL_INFINITE_LOOP")
  public static void fp2() {
    for (float x = 1.0f; x < 1000.0f; x += 1.0f) {
      boolean unreachableCondition = getUnreachableCondition();
      switch (unreachableCondition? 0 : 1) {
        case 0:
          // This case is unreachable because getUnreachableCondition() always returns false
          System.out.println("This will never be printed");
          break;
        default:
          // Default case to ensure the switch is not empty
          break;
      }
    }
  }

  private static boolean getUnreachableCondition() {
    return false;
  }
}