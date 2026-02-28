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
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      tmpxVar += 1; // This line is unreachable due to the condition being false at runtime
    }
  }

  public static void i2d_error() {
    char tmpxVar = charValue;
    tmpxVar += doubleValue;
    tmpxVar += doubleValue;
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      tmpxVar += 1; // This line is unreachable due to the condition being false at runtime
    }
  }

  public static void i2l_error() {
    char tmpxVar = charValue;
    tmpxVar += longValue;
    tmpxVar += longValue;
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      tmpxVar += 1; // This line is unreachable due to the condition being false at runtime
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}