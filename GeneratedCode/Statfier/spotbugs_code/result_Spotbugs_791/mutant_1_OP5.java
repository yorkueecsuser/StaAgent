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
        // This case is unreachable because getValue always returns 0
        tmpxVar += 1;
        break;
      default:
        // Default case is also unreachable due to the same reason
        tmpxVar += 2;
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
        // This case is unreachable because getValue always returns 0
        tmpxVar += 1;
        break;
      default:
        // Default case is also unreachable due to the same reason
        tmpxVar += 2;
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
        // This case is unreachable because getValue always returns 0
        tmpxVar += 1;
        break;
      default:
        // Default case is also unreachable due to the same reason
        tmpxVar += 2;
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }

  private static int getValue(boolean condition) {
    return condition? 1 : 0;
  }
}