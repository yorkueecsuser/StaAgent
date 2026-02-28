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
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      tmpxVar += 1;
    } else {
      // This block will always execute
      tmpxVar += 2;
    }
  }

  public static void i2d_error() {
    char tmpxVar = charValue;
    tmpxVar += doubleValue;
    tmpxVar += doubleValue;
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      tmpxVar += 1;
    } else {
      // This block will always execute
      tmpxVar += 2;
    }
  }

  public static void i2l_error() {
    char tmpxVar = charValue;
    tmpxVar += longValue;
    tmpxVar += longValue;
    
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      tmpxVar += 1;
    } else {
      // This block will always execute
      tmpxVar += 2;
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}