import javax.annotation.Nonnull;

class Bug3587164 {
  @Nonnull static final String field1 = "yyyyMMdd";

  @Nonnull static final String field2 = field1.toLowerCase();

  // Added mutant code with an unreachable switch statement
  public static void someMethod() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("Default case, also never reached due to condition");
        break;
    }
  }

  private static boolean getCondition() {
    return false; // This ensures the condition is dynamically determined but always false
  }

  private static int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0;
    }
  }
}