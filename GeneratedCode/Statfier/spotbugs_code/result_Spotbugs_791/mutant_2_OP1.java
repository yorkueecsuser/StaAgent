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
    // Dead store mutation
    int qwertyui = 10;
  }

  public static void i2d_error() {
    char tmpxVar = charValue;
    tmpxVar += doubleValue;
    tmpxVar += doubleValue;
    // Dead store mutation
    boolean asdfghjk = true;
  }

  public static void i2l_error() {
    char tmpxVar = charValue;
    tmpxVar += longValue;
    tmpxVar += longValue;
    // Dead store mutation
    short zxcvbnml = 20;
  }
}