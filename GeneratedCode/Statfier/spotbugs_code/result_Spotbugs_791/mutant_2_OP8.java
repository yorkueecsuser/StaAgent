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
    
    // Mutant code
    char b = charValue;
    b += floatValue;
    b += floatValue;
  }

  public static void i2d_error() {
    char tmpxVar = charValue;
    tmpxVar += doubleValue;
    tmpxVar += doubleValue;
    
    // Mutant code
    char c = charValue;
    c += doubleValue;
    c += doubleValue;
  }

  public static void i2l_error() {
    char tmpxVar = charValue;
    tmpxVar += longValue;
    tmpxVar += longValue;
    
    // Mutant code
    char d = charValue;
    d += longValue;
    d += longValue;
  }
}