import javax.annotation.Nonnull;

class Bug3587164 {
  @Nonnull static final String field1 = "yyyyMMdd";

  @Nonnull static final String field2 = field1.toLowerCase();

  // Added mutant code
  public static boolean getCondition() {
    return false;
  }

  public static void someMethod() {
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 1:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // This is the reachable case
        System.out.println("This is the reachable default case.");
        break;
    }
  }
}