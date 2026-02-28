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
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        tmpxVar += 1;
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
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        tmpxVar += 1;
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
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        tmpxVar += 1;
        break;
      default:
        // Default case
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}