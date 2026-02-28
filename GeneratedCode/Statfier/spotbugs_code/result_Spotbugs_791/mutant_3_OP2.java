@SuppressWarnings("unused")
class Issue389 {

  static final char charValue = 42;

  static final float floatValue = 42;

  static final double doubleValue = 42;

  static final long longValue = 42;

  public static void i2f_error() {
    char tmpxVar = charValue;
    tmpxVar += floatValue; // Original line
    tmpxVar += floatValue; // Duplicate line
    tmpxVar += floatValue; // Original line
    tmpxVar += floatValue; // Duplicate line
  }

  public static void i2d_error() {
    char tmpxVar = charValue;
    tmpxVar += doubleValue; // Original line
    tmpxVar += doubleValue; // Duplicate line
    tmpxVar += doubleValue; // Original line
    tmpxVar += doubleValue; // Duplicate line
  }

  public static void i2l_error() {
    char tmpxVar = charValue;
    tmpxVar += longValue; // Original line
    tmpxVar += longValue; // Duplicate line
    tmpxVar += longValue; // Original line
    tmpxVar += longValue; // Duplicate line
  }
}