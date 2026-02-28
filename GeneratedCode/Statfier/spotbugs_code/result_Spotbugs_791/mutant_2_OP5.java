@SuppressWarnings("unused")
class Issue389 {

  static final char charValue = 42;

  static final float floatValue = 42;

  static final double doubleValue = 42;

  static final long longValue = 42;

  public static void i2f_error() {
    char tmpxVar = charValue;
    tmpxVar += floatValue;
    tmpxVar += floatValue;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
      default:
        // Default case
        break;
    }
  }

  public static void i2d_error() {
    char tmpxVar = charValue;
    tmpxVar += doubleValue;
    tmpxVar += doubleValue;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
      default:
        // Default case
        break;
    }
  }

  public static void i2l_error() {
    char tmpxVar = charValue;
    tmpxVar += longValue;
    tmpxVar += longValue;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
      default:
        // Default case
        break;
    }
  }

  private static boolean getCondition() {
    return false; // This will always return false, but the method call ensures it's not a compile-time constant
  }

  private static int getValue(boolean condition) {
    return condition? 1 : 0; // This will always return 0, making the switch case 1 unreachable
  }
}