@SuppressWarnings("unused")
class Issue389 {

  static final char charValue = 42;

  static final float floatValue = 42;

  static final double doubleValue = 42;

  static final long longValue = 42;

  public static void i2f_error() {
    char tmpxVar = charValue;
    tmpxVar += floatValue; // Original statement
    tmpxVar += floatValue; // Duplicate statement
    tmpxVar += floatValue; // Original statement
    tmpxVar += floatValue; // Duplicate statement
  }

  public static void i2d_error() {
    char tmpxVar = charValue;
    tmpxVar += doubleValue; // Original statement
    tmpxVar += doubleValue; // Duplicate statement
    tmpxVar += doubleValue; // Original statement
    tmpxVar += doubleValue; // Duplicate statement
  }

  public static void i2l_error() {
    char tmpxVar = charValue;
    tmpxVar += longValue; // Original statement
    tmpxVar += longValue; // Duplicate statement
    tmpxVar += longValue; // Original statement
    tmpxVar += longValue; // Duplicate statement
  }
}