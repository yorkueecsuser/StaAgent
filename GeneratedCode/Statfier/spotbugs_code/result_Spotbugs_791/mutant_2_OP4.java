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

    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because getCondition() always returns false
      tmpxVar += 1;
    } else {
      // This block will always be executed
      tmpxVar += 2;
    }
  }

  public static void i2d_error() {
    char tmpxVar = charValue;
    tmpxVar += doubleValue;
    tmpxVar += doubleValue;

    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because getCondition() always returns false
      tmpxVar += 1;
    } else {
      // This block will always be executed
      tmpxVar += 2;
    }
  }

  public static void i2l_error() {
    char tmpxVar = charValue;
    tmpxVar += longValue;
    tmpxVar += longValue;

    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because getCondition() always returns false
      tmpxVar += 1;
    } else {
      // This block will always be executed
      tmpxVar += 2;
    }
  }

  // Method to provide a dynamic condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}