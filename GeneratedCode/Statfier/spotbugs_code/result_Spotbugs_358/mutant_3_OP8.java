import com.google.errorprone.annotations.CanIgnoreReturnValue;

/**
 * @see <a href="https://github.com/spotbugs/spotbugs/issues/463">GitHub issue</a>
 */
class Issue463 {
  private String value;

  String getValue() {
    return value;
  }

  @CanIgnoreReturnValue
  String returnAValue(String newValue) {
    value = newValue;
    return newValue;
  }

  String returnAnotherValue(String newValue) {
    value = newValue;
    return newValue;
  }

  public static String testNoError() {
    Issue463 i = new Issue463();
    i.returnAValue("foobar");
    return i.getValue();
  }

  public static String testWithError() {
    Issue463 i = new Issue463();
    i.returnAnotherValue("foobar");
    return i.getValue();
  }

  // Mutated code
  private String x;

  String getX() {
    return x;
  }

  @CanIgnoreReturnValue
  String returnBValue(String y) {
    x = y;
    return y;
  }

  String returnCValue(String z) {
    x = z;
    return z;
  }

  public static String testNoErrorMutant() {
    Issue463 a = new Issue463();
    a.returnBValue("foobar");
    return a.getX();
  }

  public static String testWithErrorMutant() {
    Issue463 b = new Issue463();
    b.returnCValue("foobar");
    return b.getX();
  }
}